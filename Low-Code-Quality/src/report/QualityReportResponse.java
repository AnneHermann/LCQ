package report;

import java.util.ArrayList;


public class QualityReportResponse {

	private ArrayList<MetricResponse> metrics;
	private ArrayList<PatternResponse> patterns;
	
	public QualityReportResponse() {
		this.metrics = new ArrayList<MetricResponse> ();
		this.patterns = new ArrayList<PatternResponse> ();
	}

	public void AddMetricResponse(MetricResponse metricResponse) {
		metrics.add(metricResponse);
	}

	public void AddPatternResponse(PatternResponse patternResponse) {
		patterns.add(patternResponse);
	}

	public ArrayList<MetricResponse> getMetrics() {
		return metrics;
	}

	public ArrayList<PatternResponse> getPatterns() {
		return patterns;
	}

}
