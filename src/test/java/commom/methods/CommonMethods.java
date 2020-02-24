package commom.methods;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CommonMethods {
	public static Response Commonresponse;
	public static String Commonendpoint;
	public static RequestSpecification CommonhttpRequest;
	public static String CommonjsonAsString;

	/*
	 * Created By : Elen Thendral Purpose : Execute the specific offer with id
	 * validate response code and validate isAvailableAtShortNotice and
	 * estimatedDeliveryTimeVal
	 */
	public static void specificOfferValidationWithIdForEstDTime(String id, String estimatedDeliveryTimeVal) {
		RestAssured.baseURI = "https://api.cluno.com/offerservice/v1/offer";
		CommonhttpRequest = RestAssured.given();
		Commonresponse = CommonhttpRequest.get("/" + id);
		int statusCodeOfResponse = Commonresponse.getStatusCode();
		JsonPath offers = Commonresponse.jsonPath();
		boolean isAvailableAtShortNotice = offers.get("isAvailableAtShortNotice");
		String estimatedDeliveryTime = offers.get("estimatedDeliveryTime");
		if (isAvailableAtShortNotice == true || estimatedDeliveryTime.equalsIgnoreCase(estimatedDeliveryTimeVal)) {
			System.out
					.println("The estimated delivery time is set to true and along with the estimated delivery time as "
							+ estimatedDeliveryTimeVal + "for the id : " + id);
		}

	}

	/*
	 * Created By : Elen Thendral Purpose : Execute the specific offer with id
	 * validate response code and validate fuel type and emission label
	 */
	public static void specificOfferValidationWithIdForEnvironmentFriendly(String id) {
		RestAssured.baseURI = "https://api.cluno.com/offerservice/v1/offer";
		CommonhttpRequest = RestAssured.given();
		Commonresponse = CommonhttpRequest.get("/" + id);
		int statusCodeOfResponse = Commonresponse.getStatusCode();
		JsonPath totalOffers = Commonresponse.jsonPath();
		String fuelType = totalOffers.get("car.fueltype");
		String emissionLabel = totalOffers.get("car.environment.emissionLabel");
		if (fuelType.equalsIgnoreCase("Hybrid") || fuelType.equalsIgnoreCase("Electric")
				|| emissionLabel.equalsIgnoreCase("A")) {
			System.out.println("The fuel type for the car with id " + id + " is " + fuelType + " , emission label is "
					+ emissionLabel + " and isEnvironmentallyFriendly is true");
		}
	}

}
