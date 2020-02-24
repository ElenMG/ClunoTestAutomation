package stepDefinition;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import commom.methods.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class getOffersStepDefinition {

	public static Response response;
	public static String endpoint;
	public static RequestSpecification httpRequest;
	public static String jsonAsString;

	/*
	 * Created By : Elen Thendral Purpose : Fetch the URI and end point from the
	 * feature input
	 */
	@Given("^fetch the \"([^\"]*)\" for the cluno with the endpoint \"([^\"]*)\"$")
	public void fetch_the_for_the_cluno_with_the_endpoint(String uri, String ep) throws Throwable {

		System.out.println(uri);
		RestAssured.baseURI = uri;
		httpRequest = RestAssured.given();
		endpoint = ep;
	}

	/*
	 * Created By : Elen Thendral Purpose : Execute the service with the given URI
	 * and endpoint
	 */
	@Given("^Execute the webservice for the get method$")
	public void execute_the_webservice_for_the_get_method() throws Throwable {
		response = httpRequest.get(endpoint);
	}

	/*
	 * Created By : Elen Thendral Purpose : Validate the response code and fetch the
	 * id for all offers available and check for the available parameter to true and
	 * validate the total count of offers and available = 'true' count
	 */
	@Then("^verify the response code and response with available set to true for all offers$")
	public void verify_the_response_code_and_response_with_available_set_to_true_for_all_offers() throws Throwable {
		int statusCodeOfResponse = response.getStatusCode();
		assertEquals("Response Status code", 200, statusCodeOfResponse);
		JsonPath totalOffers = response.jsonPath();
		List<String> offers = totalOffers.getList("items.id");
		int expectedAvailabelTrue = offers.size();
		int countForAvailable = 0;
		for (int idVal = 0; idVal < offers.size(); idVal++) {
			boolean availableCheck = totalOffers.get("items.available[" + idVal + "]");
			if (availableCheck == true) {
				countForAvailable++;
				System.out.println("id " + totalOffers.get("items.id[" + idVal + "]") + " has available set to -> "
						+ totalOffers.get("items.available[" + idVal + "]"));
			}

		}
		System.out.println(expectedAvailabelTrue + " " + countForAvailable);
		Assert.assertEquals("Total number of available asserted with available to be true", expectedAvailabelTrue,
				countForAvailable);

	}

	/*
	 * Created By : Elen Thendral Purpose : Validate the response code and fetch the
	 * id for all offers available and check for the environmentFriendly parameter
	 * to true and validate fuel type to be electric or hybrid or emission label to
	 * be 'A'
	 */
	@Then("^verify the response code and response if environmentFriendly is true only for cars with fuelType electric or Hybrid or with emissionLabel A$")
	public void verify_the_response_code_and_response_if_environmentFriendly_is_true_only_for_cars_with_fuelType_electric_or_Hybrid_or_with_emissionLabel_A()
			throws Throwable {
		int statusCodeOfResponse = response.getStatusCode();
		assertEquals("Response Status code", 200, statusCodeOfResponse);
		JsonPath totalOffers = response.jsonPath();
		List<String> offers = totalOffers.getList("items.id");
		int expectedAvailabelTrue = offers.size();
		int countForAvailable = 0;
		for (int idVal = 0; idVal < offers.size(); idVal++) {
			boolean isEnvironmentallyFriendlyCheck = totalOffers.get("items.isEnvironmentallyFriendly[" + idVal + "]");
			if (isEnvironmentallyFriendlyCheck == true) {
				countForAvailable++;
				String idValParam = totalOffers.get("items.id[" + idVal + "]");
				CommonMethods.specificOfferValidationWithIdForEnvironmentFriendly(idValParam);
			}

		}

	}

	/*
	 * Created By : Elen Thendral Purpose : Validate the response code and fetch the
	 * id for all offers available and check for the isAvailableAtShortNotice
	 * parameter to true and validate estimatedDeliveryTimeVal to be 'innerhalb von
	 * 2 Wochen'
	 */
	@Then("^verify the response code and response if isAvailableAtShortNotice is set to true and verify the estimatedDeliveryTime as \"([^\"]*)\" for the same$")
	public void verify_the_response_code_and_response_if_isAvailableAtShortNotice_is_set_to_true_and_verify_the_estimatedDeliveryTime_as_for_the_same(
			String estimatedDeliveryTimeVal) throws Throwable {
		int statusCodeOfResponse = response.getStatusCode();
		assertEquals("Response Status code", 200, statusCodeOfResponse);
		JsonPath offers = response.jsonPath();
		boolean isAvailableAtShortNotice = offers.get("isAvailableAtShortNotice");
		String estimatedDeliveryTime = offers.get("estimatedDeliveryTime");
		if (isAvailableAtShortNotice == true || estimatedDeliveryTime.equalsIgnoreCase(estimatedDeliveryTimeVal)) {
			System.out
					.println("The estimated delivery time is set to true and along with the estimated delivery time as "
							+ estimatedDeliveryTimeVal);
		}

	}

	/*
	 * Created By : Elen Thendral Purpose : Validate the response code and fetch the
	 * id for specific available and check for the isAvailableAtShortNotice
	 * parameter to true and validate estimatedDeliveryTimeVal to be 'innerhalb von
	 * 2 Wochen'
	 */
	@Then("^verify the response code and response for all offers if isAvailableAtShortNotice is set to true and verify the estimatedDeliveryTime as \"([^\"]*)\" for the same$")
	public void verify_the_response_code_and_response_for_all_offers_if_isAvailableAtShortNotice_is_set_to_true_and_verify_the_estimatedDeliveryTime_as_for_the_same(
			String estimatedDeliveryTimeVal) throws Throwable {
		int statusCodeOfResponse = response.getStatusCode();
		assertEquals("Response Status code", 200, statusCodeOfResponse);
		JsonPath totalOffers = response.jsonPath();
		List<String> offers = totalOffers.getList("items.id");
		System.out.println(offers.size());
		for (int idVal = 0; idVal < offers.size(); idVal++) {
			String idValParam = totalOffers.get("items.id[" + idVal + "]");
			CommonMethods.specificOfferValidationWithIdForEstDTime(idValParam, estimatedDeliveryTimeVal);
		}

	}
	
	
	@Then("^verify the response code for specific offer and response if environmentFriendly is true only for cars with fuelType electric or Hybrid or with emissionLabel A$")
	public void verify_the_response_code_for_specific_offer_and_response_if_environmentFriendly_is_true_only_for_cars_with_fuelType_electric_or_Hybrid_or_with_emissionLabel_A() throws Throwable {
	   
		int statusCodeOfResponse = response.getStatusCode();
		assertEquals("Response Status code", 200, statusCodeOfResponse);
		JsonPath totalOffers = response.jsonPath();
		boolean isEnvironmentallyFriendlyCheck = totalOffers.get("isEnvironmentallyFriendly");
		System.out.println(isEnvironmentallyFriendlyCheck);
		if (isEnvironmentallyFriendlyCheck == true) {
			String fuelType = totalOffers.get("car.fueltype");
			String emissionLabel = totalOffers.get("car.environment.emissionLabel");
			String idValParam = totalOffers.get("id");
			if (fuelType.equalsIgnoreCase("Hybrid") || fuelType.equalsIgnoreCase("Electric")
					|| emissionLabel.equalsIgnoreCase("A")) {
				System.out.println("The fuel type for the car with id " + idValParam + " is " + fuelType + " , emission label is "
						+ emissionLabel + " and isEnvironmentallyFriendly is true");
			}
		}
	}


}
