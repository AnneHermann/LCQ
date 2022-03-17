package patterns;

import BspKnotensystem.DocumentRoot;
import report.QualityReportResponse;

public interface IPattern {
	
	public void findPattern(DocumentRoot root, QualityReportResponse response);

}
