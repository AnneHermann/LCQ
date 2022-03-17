package report;

import metrics.IMetric;
import patterns.IPattern;

public class Response {
	
	//hier einfach raw (Name Metrik, Ergebnis)

	public IMetric[] metrics;
	public IPattern[] patterns;

	public Response(IMetric[] metrics, IPattern[] patterns) {
		this.metrics = metrics;
		this.patterns = patterns;
	}

}
