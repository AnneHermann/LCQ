package app;

import org.eclipse.emf.common.util.URI;
import metrics.MetricCalculator;
import patterns.PatternMatcher;
import report.QualityReportCreator;
import report.QualityReportResponse;

public class App {

	public static void main(String[] args) {
		// TODO: String uri = System.console().readLine();
		// TODO: Exceptions hier behandeln
		var documentRoot = XMLConverter.convertLowCodeXML(createURI(args[0]));
		var response = new QualityReportResponse();
		MetricCalculator.CalculateAll(documentRoot, response);
		PatternMatcher.MatchAll(documentRoot, response);
		QualityReportCreator.outputResponseToConsole(response);
	}

	private static URI createURI(String uri) {
		try {

			return URI.createFileURI(uri);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		return URI.createFileURI(""); // TODO: wie soll es danach weiter gehen
	}

}
