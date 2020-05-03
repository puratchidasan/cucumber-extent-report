package stepdefs;

import io.cucumber.java8.En;
import selenium.WebDriverFacade;

public class BrowserStepDef implements En {

	public BrowserStepDef() {
		Given("I open the chrome browser", () -> {
			WebDriverFacade driverFacade = new WebDriverFacade("chrome");
			driverFacade.start("https://www.google.co.in/");

			Thread.sleep(5000);

			driverFacade.stop();
		});
	}
}
