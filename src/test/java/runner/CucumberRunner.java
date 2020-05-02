package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "stepdefs" },monochrome=true, plugin = {
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
		"html:target/cucumberReport",
		"json:target/cucumberReport/cucumber-json-report.json",
		"junit:target/cucumberReport/cucumber.xml" }, features = { 
				//"src/test/resources/features/parametertype.feature",
				//"src/test/resources/features/datatabletype.feature",
				//"src/test/resources/features/scenariooutlines.feature",
				//"src/test/resources/features/scenarios1.feature", "src/test/resources/features/scenarios2.feature",
				//"src/test/resources/features/weather.feature", "src/test/resources/features/shopping.feature",
				//"src/test/resources/features/sum-example.feature", "src/test/resources/features/pricelist.feature",
				//"src/test/resources/features/GetBookByISBN.feature",
				"src/test/resources/features/WeatherApiResponseValid.feature",
				"src/test/resources/features/weather_datatable.feature" })
public class CucumberRunner {
	@AfterClass
    public static void setup() {
   }
	
}
