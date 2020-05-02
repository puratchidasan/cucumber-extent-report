package stepdefs;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceListSteps {
	private Map<String, Integer> priceList;
	private int totalSum;

	@Given("the price list for a coffee shop")
	public void the_price_list_for_a_coffee_shop(Map<String, Integer> priceList) {
		this.priceList = priceList;
		System.out.println("priceList="+priceList.size());
	}

	@When("I order (\\d+) ([^\"]*)")
	public void i_order(Integer numberOfFirstItems, String item) {
		int firstPrice = priceList.get(item);

		totalSum += firstPrice * numberOfFirstItems;
	}

	@Then("should I pay (\\d+)$")
	public void should_I_pay(int expectedCost) {
		assertThat(totalSum, is(expectedCost));
	}
}
