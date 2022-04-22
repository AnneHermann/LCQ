package report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QualityReportCreator {

	private static final String NEIN = "nein";
	private static final String MAL = " mal";
	private static final String JA = "ja ";
	private static final String KOMMT_VOR = " kommt vor: ";
	private static final String COLON = ": ";
	private static final String MUSTER = "Muster";
	private static final String METRIKEN = "Metriken";

	public static void outputResponseToConsole(QualityReportResponse response) {
		System.out.println(METRIKEN);
		for (var metric : response.getMetrics()) {
			System.out.println(buildMetricOutput(metric));
		}
		System.out.println(MUSTER);
		for (var pattern : response.getPatterns()) {
			System.out.println(buildPatternOutput(pattern));
		}
	}

	public static void OutputResponseToCSV(QualityReportResponse response) {
		writeCSVOutputToConsole(buildMetricCSVOutput(response.getMetrics()), new File("QualityReportMetrics.csv"));
		writeCSVOutputToConsole(buildPatternCSVOutput(response.getPatterns()), new File("QualityReportAntiPattern.csv"));
		
	}

	private static void writeCSVOutputToConsole(ArrayList<String[]> input, File csvOutput) {		
			input.stream().map(item -> convertToCSV(item)).forEach(System.out::println);
		
	}

	private static String convertToCSV(String[] data) {
		return Stream.of(data).collect(Collectors.joining(","));
	}

	private static ArrayList<String[]> buildMetricCSVOutput(ArrayList<MetricResponse> metrics) {
		var metricDataLines = new ArrayList<String[]>();
		for (var metric : metrics) {
			metricDataLines.add(new String[] { metric.getName(), metric.getResult() });
		}
		return metricDataLines;
	}

	private static ArrayList<String[]> buildPatternCSVOutput(ArrayList<PatternResponse> patterns) {
		var patternDataLines = new ArrayList<String[]>();
		for (var pattern : patterns) {
			patternDataLines.add(new String[] { pattern.getName(), Boolean.toString(pattern.isFound()),
					Integer.toString(pattern.getNumberOfOccurrences()) });
		}
		return patternDataLines;
	}

	private static String buildMetricOutput(MetricResponse metric) {
		return metric.getName() + COLON + metric.getResult();
	}

	private static String buildPatternOutput(PatternResponse pattern) {
		var begin = pattern.getName() + KOMMT_VOR;
		if (pattern.isFound()) {
			return begin + JA + pattern.getNumberOfOccurrences() + MAL;
		} else {
			return begin + NEIN;
		}
	}

}
