package stepdefs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import dataobject.FBUser;
import dataobject.FBUserRow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import selenium.WebDriverFacade;

public class FacebookStepDefs  {
	
	WebDriverFacade driverFacade = new WebDriverFacade("chrome");

	@Given("I enter the below details to create user account")
	public void theMapLectureDetailsAre(Map<FBUserRow, FBUser> userMap) throws InterruptedException {
		System.out.println("Testing....");
		List<FBUserRow> keyList = userMap.keySet().stream().collect(Collectors.toList());

		List<FBUser> valueList = userMap.values().stream().collect(Collectors.toList());

		System.out.println(keyList.size());
		System.out.println(valueList.size());

		System.out.println(keyList);
		System.out.println(valueList);
		for (FBUser fbUser : valueList) {
			
			boolean success= testfbuser(fbUser);
			
			System.out.println(fbUser.getFirstName());
			
			System.out.println(fbUser.getSurName());
			System.out.println(fbUser.getMobileNumber());
			System.out.println(fbUser.getDay());
			System.out.println(fbUser.getMonth());
			System.out.println(fbUser.getYear());
			System.out.println(fbUser.getGender());
		}

	}

	private boolean testfbuser(FBUser fbUser) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driverFacade.start("https://www.facebook.com/");
		driverFacade.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fbUser.getFirstName());
		driverFacade.findElement(By.xpath("//input[@name='lastname']")).sendKeys(fbUser.getSurName());
		driverFacade.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(fbUser.getMobileNumber());
		driverFacade.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(fbUser.getPassword());
		driverFacade.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys(fbUser.getDay());
		driverFacade.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys(fbUser.getMonth());
		driverFacade.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys(fbUser.getYear());
		driverFacade.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		driverFacade.findElement(By.xpath("//button[@name='websubmit']")).click();
		
			return false;
	}

	@And("click on signup button")
	public void clickOnSignup() {
		
			}

	@Then("user should able to view an account succesfully")
	public void userShouldableTo() {
		//driverFacade.stop();

	}
}
