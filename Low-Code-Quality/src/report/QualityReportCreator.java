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
		var csvOutputReport = new File("QualityReport");
		writeInCSV(buildMetricCSVOutput(response.getMetrics()), csvOutputReport);
		writeInCSV(buildPatternCSVOutput(response.getPatterns()), csvOutputReport);
		
	}

	private static void writeInCSV(ArrayList<String[]> input, File csvOutput) {
		try (PrintWriter printWriter = new PrintWriter(csvOutput)) {
			printWriter.println();
		//TODO	input.stream().map(convertToCSV()).forEach(printWriter::println);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String convertToCSV(String[] data) {
		//TODO return Stream.of(data).map().collect(Collectors.joining(","));
		return "";
	}

	private static ArrayList<String[]> buildMetricCSVOutput(ArrayList<MetricResponse> metrics) {
		var metricDataLines = new ArrayList<String[]>();
		for (var metric : metrics) {
			metricDataLines.add(new String[] { metric.getName(), metric.getResult() });
		}
		return metricDataLines;
	}

	private static ArrayList<String[]> buildPatternCSVOutput(ArrayList<PatternResponse> patterns) {
		var metricDataLines = new ArrayList<String[]>();
		for (var pattern : patterns) {
			metricDataLines.add(new String[] { pattern.getName(), Boolean.toString(pattern.isFound()),
					Integer.toString(pattern.getNumberOfOccurrences()) });
		}
		return metricDataLines;
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
