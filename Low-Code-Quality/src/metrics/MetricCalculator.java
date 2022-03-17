package metrics;

import java.util.ArrayList;
import java.util.Arrays;

import BspKnotensystem.DocumentRoot;
import report.QualityReportResponse;

public class MetricCalculator {
	
	private static final ArrayList<IMetric> metrics = new ArrayList<IMetric>(Arrays.asList(new NumberOfNodes())); //TODO: wo festhalten welche Metriken es gibt
	
	
	public static void CalculateAll(DocumentRoot root, QualityReportResponse response) {
		for(var metric : metrics) {
			metric.calculate(root, response);
		}
	}
	

}
