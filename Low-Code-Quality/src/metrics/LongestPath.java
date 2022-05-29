package metrics;

import AlleKnotenFormartiert.NodeSystemType;
import report.MetricResponse;
import report.QualityReportResponse;

public class LongestPath implements IMetric {

	private static final String LÄNGE_DES_LÄNGESTEN_PFADS = "Länge des längesten Pfads";

	@Override
	public void Calculate(NodeSystemType nodeSystem, QualityReportResponse response) {
		var pathCalculator = new PathCalculator(nodeSystem);

		response.AddMetricResponse(new MetricResponse(LÄNGE_DES_LÄNGESTEN_PFADS,
				Integer.toString(pathCalculator.getLengthOfLongestPath())));
	}

}
