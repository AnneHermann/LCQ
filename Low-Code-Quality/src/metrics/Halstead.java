package metrics;

import AlleKnotenFormartiert.NodeSystemType;
import report.MetricResponse;
import report.QualityReportResponse;

public class Halstead implements IMetric {

	private static final String AUFWAND = "; Aufwand; ";
	private static final String SCHWIERIGKEIT = "; Schwierigkeit; ";
	private static final String VOLUMEN = "; Volumen; ";
	private static final String IMPLEMENTIERUNGSLÄNGE = "; Implementierungslänge; ";
	private static final String VOKABULARGRÖßE = "Vokabulargröße; ";

	@Override
	public void Calculate(NodeSystemType nodeSystem, QualityReportResponse response) {
		var programVocabulary = calculateProgramVocabulary(nodeSystem);
		var programLength = calculateProgramLength(nodeSystem);
		var volume = calculateVolume(programLength, programVocabulary);
		var difficulty = calcualteDifficulty(calculateNumberOfDistinctOperators(nodeSystem),
				(int) calculateNumberOfDistinctOperands(nodeSystem),
				(int) calculateNumberOfDistinctOperands(nodeSystem));
		var effort = calculateEffort(difficulty, volume);

		var output = buildOutput(programVocabulary, programLength, volume, difficulty, effort);
		response.AddMetricResponse(new MetricResponse("Halstead-Metrik", output));

	}

	private String buildOutput(long programVocabulary, long programLength, double volume, double difficulty,
			double effort) {
		var output = new StringBuilder();
		output.append(VOKABULARGRÖßE);
		output.append(programVocabulary);
		output.append(IMPLEMENTIERUNGSLÄNGE);
		output.append(programLength);
		output.append(VOLUMEN);
		output.append(volume);
		output.append(SCHWIERIGKEIT);
		output.append(difficulty);
		output.append(AUFWAND);
		output.append(effort);

		return output.toString();
	}

	private long calculateProgramVocabulary(NodeSystemType nodeSystem) {
		return calculateNumberOfDistinctOperators(nodeSystem) + calculateNumberOfDistinctOperands(nodeSystem);
	}

	private Integer calculateNumberOfDistinctOperands(NodeSystemType nodeSystem) {
		return nodeSystem.getSources().get(0).getSource().stream()
				.map(source -> source.getSourceColumns().get(0).getSourceColumn().size()).reduce(0, Integer::sum); // TODO:
																													// distinct?
	}

	private long calculateNumberOfDistinctOperators(NodeSystemType nodeSystem) {
		return nodeSystem.getNodes().get(0).getNode().stream().map(node -> node.getNodeClassId()).distinct().count();
	}

	private long calculateProgramLength(NodeSystemType nodeSystem) {
		return calculateNumberOfDistinctOperands(nodeSystem) + getNumberOfOperators(nodeSystem);
	}

	private long getNumberOfOperators(NodeSystemType nodeSystem) {
		return nodeSystem.getNodes().get(0).getNode().stream().count();
	}

	private double calculateVolume(long programLength, long programVocabulary) {
		return programLength * log2(programVocabulary);
	}

	private double calcualteDifficulty(long numberOfDistinctOperators, int numberOfDistinctOperands,
			int numberOfOperands) {
		return (numberOfDistinctOperators / 2) * (numberOfDistinctOperands / numberOfOperands);
	}

	private double calculateEffort(double difficulty, double volume) {
		return difficulty * volume;
	}

	private double log2(double N) {
		return Math.log(N) / Math.log(2);
	}

}
