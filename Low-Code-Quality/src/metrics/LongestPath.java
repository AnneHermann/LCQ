package metrics;

import AlleKnotenFormartiert.DocumentRoot;
import report.MetricResponse;
import report.QualityReportResponse;

public class LongestPath implements IMetric {

	private static final String L�NGE_DES_L�NGESTEN_PFADS = "L�nge des l�ngesten Pfads";

	@Override
	public void Calculate(DocumentRoot documentRoot, QualityReportResponse response) {
		var pathCalculator = new PathCalculator(documentRoot.getNodeSystem());
		
		response.AddMetricResponse(new MetricResponse(L�NGE_DES_L�NGESTEN_PFADS, Integer.toString(pathCalculator.getLengthOfLongestPath())));
		
	}

}
