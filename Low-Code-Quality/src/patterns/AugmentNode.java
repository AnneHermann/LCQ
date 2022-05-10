package patterns;

import org.eclipse.emf.common.util.EList;

import AlleKnotenFormartiert.AugmentNodeType;
import AlleKnotenFormartiert.DocumentRoot;
import report.PatternResponse;
import report.QualityReportResponse;
import static java.lang.Math.toIntExact;

public class AugmentNode implements IPattern {
	
	private static final String AUGMENT_KNOTEN = "Augment-Knoten";

	public void FindPattern(DocumentRoot root, QualityReportResponse response) {
		var augmentNodes = root.getNodeSystem().getNodes().stream().filter(node -> node instanceof AugmentNodeType);
		addPatternToResponse(toIntExact(augmentNodes.count()), response);

	}
	
	private void addPatternToResponse(int numberOfOccurrences, QualityReportResponse response) {
		if(numberOfOccurrences == 0) {
			response.AddPatternResponse(new PatternResponse(AUGMENT_KNOTEN, false, 0));
		}
		else {
			response.AddPatternResponse(new PatternResponse(AUGMENT_KNOTEN, true, numberOfOccurrences));
		}
	}

}
