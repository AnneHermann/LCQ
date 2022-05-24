package metrics;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import AlleKnotenFormartiert.DocumentRoot;
import AlleKnotenFormartiert.NodeSystemType;
import AlleKnotenFormartiert.NodesType;
import report.MetricResponse;
import report.QualityReportResponse;

public class NumberOfNodes implements IMetric {

	private static final String ANZAHL_DER_KNOTEN = "Anzahl der Knoten";

	public void Calculate(DocumentRoot documentRoot, QualityReportResponse response) {
		var nodeSystem = documentRoot.getNodeSystem();
		var numberOfFunctionalNodes = getNumberOfFunctionalNodes(nodeSystem);
		var numberOfSources = nodeSystem.getSources().get(0).getSource().size();
		var numberOfFunctionResult = nodeSystem.getFunctionResults().get(0).getFunctionResult().size();
		var numberOfResults = nodeSystem.getResults().get(0).getResult().size();
		var numberOfNodes = numberOfFunctionalNodes + numberOfSources + numberOfResults + numberOfFunctionResult;

		response.AddMetricResponse(new MetricResponse(ANZAHL_DER_KNOTEN, Integer.toString(numberOfNodes)));
	}

	private int getNumberOfFunctionalNodes(NodeSystemType nodeSystem) {
		var counter = 0;
		var nodes = nodeSystem.getNodes().get(0);

		List<Field> fields = Arrays.asList(nodes.getClass().getDeclaredFields());

		for (Field field : fields) {
			field.setAccessible(true);
			try {
				if (field.getName().contains("Node") && field.get(nodes) != null) {
					var length = Array.getLength(field.get(nodes));
					counter += length;
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return counter;
	}
	
}
