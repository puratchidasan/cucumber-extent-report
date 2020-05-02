package stepdefs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import dataobject.Weather;
import dataobject.WeatherId;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class WeatherStepDefinitions {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;

	private String ENDPOINT_WEATHER_API = "http://api.weatherstack.com/current?access_key=4bb95b1299b55098b766112e7c1dff07";


	@Given("^a weather exists with a city of ([^\"]*)")
	public void a_weather_exists_with_a_city_of(String cityname){
		request = given().param("query", cityname);
	}

	@When("^a user retrieves the weather by city$")
	public void a_user_retrieves_the_weather_by_city(){
		response = request.when().get(ENDPOINT_WEATHER_API);
		System.out.println("response: " + response.prettyPrint());
	}
	@Then("the weather status code is (\\d+)")
	public void verify_weather_status_code(int statusCode){
		json = response.then().statusCode(statusCode);
	}
	@And("the expected attributes are below")
	public void the_expected_attributes_are_below(Map<String, String> responseFields) {
		for (Map.Entry<String, String> field : responseFields.entrySet()) {

			if (StringUtils.isNumeric(field.getValue())) {
				json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
				System.out.println("Expected keys & values :" + field);

			} else {
				json.body(field.getKey(), equalTo(field.getValue()));
				System.out.println("Expected keys & values :" + field);

			}
		}
	}
	
	
	@Given("validate the weather for the given city names with below details are")
	public void theMapLectureDetailsAre(Map<WeatherId, Weather> weatherMap) throws NoSuchFieldException, SecurityException {
		System.out.println("");
		
		List<WeatherId> keyList = weatherMap.keySet().stream()
				.collect(Collectors.toList());
		
		List<Weather> valueList = weatherMap.values().stream()
				.collect(Collectors.toList());
		//json.body(field.getKey(), equalTo(field.getValue()));
		
		System.out.println(keyList);
		System.out.println(valueList);
		
	for (WeatherId weatherKey : keyList) {
			System.out.println("weatherKey:"+weatherKey);
			request = given().param("query", weatherKey);
			response = request.when().get(ENDPOINT_WEATHER_API);
			json = response.then().statusCode(200);
			System.out.println("response: " + response.prettyPrint());
			
		
			//json.body("location.timezone_id", equalTo(cityMap.get(weatherKey).getTimezone_id()));
			json.body("location.region", equalTo(weatherMap.get(weatherKey).getRegion()));
			json.body("location.country", equalTo(weatherMap.get(weatherKey).getCountry()));
			json.body("location.name", equalTo(weatherMap.get(weatherKey).getName()));	
			System.out.println("");
		}
		
		
	}
}


