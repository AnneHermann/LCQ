package report;

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
