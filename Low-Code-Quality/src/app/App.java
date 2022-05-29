package app;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import metrics.MetricCalculator;
import report.QualityReportCreator;
import report.QualityReportResponse;

public class App {

	public static void main(String[] args) {
		// TODO: Exceptions hier behandeln
		var documentRoot = XMLConverter.ConvertLowCodeXML(CreateURI(args[0]));
		var nodeSystem = documentRoot.getNodeSystem();
		LowCodeProgramPreprocessor.FillOutputs(nodeSystem);
		LowCodeProgramPreprocessor.FillAdjacencyLists(nodeSystem);
		var response = new QualityReportResponse();
		MetricCalculator.CalculateAll(nodeSystem, response);
		OutputReport(args, response);
	}

	private static URI CreateURI(String uri) {
		try {
			return URI.createFileURI(uri);
		} catch (IllegalArgumentException e) {
			System.out.println("Erstes Argument ist keine gülitge URL.");
			e.printStackTrace();
			System.exit(-1); // TODO: nix gut oder?
		}
		return null;
	}

	private static void OutputReport(String[] args, QualityReportResponse response) {
		Options options = new Options();
		options.addOption("csv", false, "Output report in csv format");
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd;
		HelpFormatter formatter = new HelpFormatter();
		try {
			cmd = parser.parse(options, args);
			if (cmd.hasOption("csv")) {
				QualityReportCreator.OutputResponseToCSV(response);
				return;
			}
		} catch (ParseException e) {
			System.out.println("Falscher Parameter");
			formatter.printHelp("LCQ", options);
			e.printStackTrace();
		}

		QualityReportCreator.OutputResponseToConsole(response);
	}

}
