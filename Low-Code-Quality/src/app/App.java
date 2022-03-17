package app;

import org.eclipse.emf.common.util.URI;
import metrics.MetricCalculator;
import patterns.PatternMatcher;
import report.QualityReportCreator;
import report.QualityReportResponse;

public class App {

	public static void main(String[] args) {
		var documentRoot = XMLConverter.convertLowCodeXML(URI.createFileURI(args[0]));
		var response = new QualityReportResponse();
		MetricCalculator.CalculateAll(documentRoot, response);
		PatternMatcher.MatchAll(documentRoot, response);
		QualityReportCreator.outputResponseToConsole(response);
	}


}
