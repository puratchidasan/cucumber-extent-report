package selenium;

import org.openqa.selenium.By;

public class TestSeleniumDriver {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverFacade driverFacade = new WebDriverFacade("chrome");
		//driverFacade.start("https://www.google.co.in/");
		
		WebDriverFacade driverFacade = new WebDriverFacade("chrome");
		driverFacade.start("https://www.facebook.com/");
		driverFacade.findElement(By.xpath("//input[@name='firstname']")).sendKeys("");
		driverFacade.findElement(By.xpath("//input[@name='lastname']")).sendKeys("");
		driverFacade.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("");
		driverFacade.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("");
		driverFacade.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("");
		driverFacade.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("");
		driverFacade.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("");
		driverFacade.findElement(By.xpath("//input[@value='sex']")).click();
		driverFacade.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		//Thread.sleep(5000);

		driverFacade.stop();

	}

}
