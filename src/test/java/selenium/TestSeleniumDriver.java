package selenium;

public class TestSeleniumDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriverFacade driverFacade = new WebDriverFacade("chrome");
		driverFacade.start("https://www.google.co.in/");
		
		Thread.sleep(5000);

		driverFacade.stop();

	}

}
