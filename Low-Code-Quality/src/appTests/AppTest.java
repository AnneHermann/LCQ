package appTests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

import app.App;

public class AppTest {

	@Test
	public void calculateForAllNodeSystems() {
		var path = "C:\\Users\\hermanne\\Documents\\Bachelorarbeit\\Knotensysteme\\";
		String[] nodeSystems = { "10", "11", "12", "13", "14", "15_1", "15_2", "16_korrigiert", "17", "18", "19_1",
				"19_2", "20_1_korrigiert", "21_1", "21_2", "22_1", "22_2", "23_2", "24_1", "24_2", "25_1", "25_2" };
		var ending = ".xml";
	
		for(var nodeSystem : nodeSystems) {
			var fullPath = path + nodeSystem + ending;
			String[] args = {fullPath, "-csv"};
			App.main(args);
		}
	}

	@Test
	public void wrongConsoleParamter_ThrowsNothing() {

	}

	@Test
	public void invalidURI_GivesErrorMessage() {

	}

	@Test
	public void validURI_ThrowsNothing() {
		String[] args = { "C:\\Users\\hermanne\\Documents\\Bachelorarbeit\\Knotensysteme\\25_2.xml" };
		assertDoesNotThrow(() -> {
			App.main(args);
		});

	}

}
