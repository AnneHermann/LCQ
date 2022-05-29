package metrics;

import java.util.ArrayList;
import java.util.Arrays;

import AlleKnotenFormartiert.NodeSystemType;
import report.QualityReportResponse;

public class MetricCalculator {

	private static final ArrayList<IMetric> metrics = new ArrayList<IMetric>(Arrays.asList(new NumberOfNodesAndEdges(),
			new LinesOfComments(), new AverageDegree(), new LongestPath(), new AveragePathLength(), new Halstead())); // TODO:
	// wo
	// festhalten
	// welche
	// Metriken
	// es
	// gibt

	public static void CalculateAll(NodeSystemType nodeSystem, QualityReportResponse response) {
		for (var metric : metrics) {
			metric.Calculate(nodeSystem, response);
		}
	}

}
