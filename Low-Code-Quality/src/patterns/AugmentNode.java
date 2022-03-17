package patterns;

import org.eclipse.emf.common.util.EList;

import BspKnotensystem.DocumentRoot;
import BspKnotensystem.NodeType;
import report.PatternResponse;
import report.QualityReportResponse;

public class AugmentNode implements IPattern {
	
	private static final String AUGMENT_KNOTEN = "Augment-Knoten";

	public void findPattern(DocumentRoot root, QualityReportResponse response) {
		var nodes = root.getNodeSystem().getNodes().get(0).getNode();
		var numberOfOccurrences = countOccurrences(nodes);
		addPatternToResponse(numberOfOccurrences, response);

	}
	
	private int countOccurrences(EList<NodeType> nodes) {
		var patternCounter = 0;
		for(int i = 0; i < nodes.size(); i++) {
			if(nodes.get(i).getNodeName().equals("augment")) {
				patternCounter++;
			}
		}
		return patternCounter;
	}
	
	private void addPatternToResponse(int numberOfOccurrences, QualityReportResponse response) {
		if(numberOfOccurrences == 0) {
			response.addPattern(new PatternResponse(AUGMENT_KNOTEN, false, 0));
		}
		else {
			response.addPattern(new PatternResponse(AUGMENT_KNOTEN, true, numberOfOccurrences));
		}
	}

}
