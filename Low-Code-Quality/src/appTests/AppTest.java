package appTests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

import app.App;

public class AppTest {

	@Test
	public void wrongConsoleParamter_ThrowsNothing() {

	}

	@Test
	public void invalidURI_GivesErrorMessage() {

	}

	@Test
	public void validURI_ThrowsNothing() {
		String[] args = {"C:\\Users\\hermanne\\Documents\\Bachelorarbeit\\Knotensysteme\\25_2.xml"};
		assertDoesNotThrow(() -> {
			App.main(args);
			});

	}

}
