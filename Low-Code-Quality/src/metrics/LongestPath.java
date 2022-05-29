package metrics;

import AlleKnotenFormartiert.NodeSystemType;
import report.MetricResponse;
import report.QualityReportResponse;

public class LongestPath implements IMetric {

	private static final String L�NGE_DES_L�NGESTEN_PFADS = "L�nge des l�ngesten Pfads";

	@Override
	public void Calculate(NodeSystemType nodeSystem, QualityReportResponse response) {
		var pathCalculator = new PathCalculator(nodeSystem);

		response.AddMetricResponse(new MetricResponse(L�NGE_DES_L�NGESTEN_PFADS,
				Integer.toString(pathCalculator.getLengthOfLongestPath())));
	}

}
