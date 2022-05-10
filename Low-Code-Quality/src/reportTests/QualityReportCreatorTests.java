package reportTests;

import org.junit.Assert;
import org.junit.Test;

import report.MetricResponse;
import report.PatternResponse;
import report.QualityReportCreator;
import report.QualityReportResponse;

public class QualityReportCreatorTests {
	
	private QualityReportResponse qualityReportResponse;
	
	
	private void BuildData() {
		var exmapleMetricResponse = new MetricResponse("Anzahl der Knoten", "4");
		var examplePatternResponse = new PatternResponse("Augment-Knoten", true, 1);
		qualityReportResponse.AddMetricResponse(exmapleMetricResponse);
		qualityReportResponse.AddPatternResponse(examplePatternResponse);
	}
	
	@Test
	public void OutputResponseToCSVWritesinCSVFormat() {
		//Assert.(QualityReportCreator.OutputResponseToCSV(qualityReportResponse), null);
	}

}
