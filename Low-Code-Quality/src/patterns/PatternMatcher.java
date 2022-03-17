package patterns;

import java.util.ArrayList;
import java.util.Arrays;

import BspKnotensystem.DocumentRoot;
import report.QualityReportResponse;

public class PatternMatcher {

	private static final ArrayList<IPattern> patterns = new ArrayList<IPattern>(Arrays.asList(new AugmentNode())); 

	
	public static void MatchAll(DocumentRoot root, QualityReportResponse response) {
		for(var pattern : patterns) {
			pattern.findPattern(root, response);
		}
	}
}
