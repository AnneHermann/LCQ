package app;

import org.eclipse.emf.common.util.URI;
import metrics.MetricCalculator;
import patterns.PatternMatcher;
import report.QualityReportCreator;
import report.QualityReportResponse;

public class App {

	public static void main(String[] args) {
		// TODO: Exceptions hier behandeln
		var documentRoot = XMLConverter.ConvertLowCodeXML(CreateURI(args[0]));
		var response = new QualityReportResponse();
		MetricCalculator.CalculateAll(documentRoot, response);
		PatternMatcher.MatchAll(documentRoot, response);
		OutputReport("-csv", response); //TODO: args[1]
	}

	private static URI CreateURI(String uri) {
		try {
			return URI.createFileURI(uri);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.exit(-1); // TODO: nix gut oder?
		}
		return null;
	}

	private static void OutputReport(String csvOption, QualityReportResponse response) {
		if (csvOption == "-csv") {
			QualityReportCreator.OutputResponseToCSV(response);
			return;
		}

		QualityReportCreator.OutputResponseToConsole(response);
	}

}
