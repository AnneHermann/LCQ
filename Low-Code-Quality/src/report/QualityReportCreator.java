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

	public static void OutputResponseToConsole(QualityReportResponse response) {
		System.out.println(METRIKEN);
		for (var metric : response.getMetrics()) {
			System.out.println(BuildMetricOutput(metric));
		}
		System.out.println(MUSTER);
		for (var pattern : response.getPatterns()) {
			System.out.println(BuildPatternOutput(pattern));
		}
	}

	public static void OutputResponseToCSV(QualityReportResponse response) {
		WriteCSVOutputToConsole(BuildMetricCSVOutput(response.getMetrics()));
		WriteCSVOutputToConsole(BuildPatternCSVOutput(response.getPatterns()));
		
	}

	private static void WriteCSVOutputToConsole(ArrayList<String[]> input) {		
			input.stream().map(item -> ConvertToCSV(item)).forEach(System.out::println);
		
	}

	private static String ConvertToCSV(String[] data) {
		return Stream.of(data).collect(Collectors.joining(","));
	}

	private static ArrayList<String[]> BuildMetricCSVOutput(ArrayList<MetricResponse> metrics) {
		var metricDataLines = new ArrayList<String[]>();
		for (var metric : metrics) {
			metricDataLines.add(new String[] { metric.getName(), metric.getResult() });
		}
		return metricDataLines;
	}

	private static ArrayList<String[]> BuildPatternCSVOutput(ArrayList<PatternResponse> patterns) {
		var patternDataLines = new ArrayList<String[]>();
		for (var pattern : patterns) {
			patternDataLines.add(new String[] { pattern.getName(), Boolean.toString(pattern.isFound()),
					Integer.toString(pattern.getNumberOfOccurrences()) });
		}
		return patternDataLines;
	}

	private static String BuildMetricOutput(MetricResponse metric) {
		return metric.getName() + COLON + metric.getResult();
	}

	private static String BuildPatternOutput(PatternResponse pattern) {
		var begin = pattern.getName() + KOMMT_VOR;
		if (pattern.isFound()) {
			return begin + JA + pattern.getNumberOfOccurrences() + MAL;
		} else {
			return begin + NEIN;
		}
	}

}
