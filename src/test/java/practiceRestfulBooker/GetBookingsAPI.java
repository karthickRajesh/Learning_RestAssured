package practiceRestfulBooker;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.utils.LoggerUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import listeners.TestListener;

@Listeners(TestListener.class)
public class GetBookingsAPI {
	private static final Logger logger = LoggerUtil.getLogger(GetBookingsAPI.class);

	@Test
	public void getBookingsAPIandvalidatewithResponse() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		RequestSpecification request = RestAssured.given();

		Response response = request.get("/booking");
//        System.out.println("Status Code: " + response.getStatusCode());
//        System.out.println("Response Body: " + response.getBody().asString());

		logger.trace("Status Code: " + response.getStatusCode());
		logger.debug("Response Body: " + response.getBody().asString());
		logger.info("info is");
		logger.warn("warn is ");
		logger.error("error is");
		logger.fatal("fatal is");

		Assert.assertEquals(response.getStatusCode(), 200, "Passed");

	}

	@Test
	public void getBookingsAPIandvalidatewithValidatableResponse() {

		// Create a request specification
		RequestSpecification request = RestAssured.given();
		// Adding URI
		request.baseUri("https://restful-booker.herokuapp.com");
		// Calling GET method on URI. After hitting we get Response
		Response response = request.get("/booking");

		// Let's print response body.
		String respoinseaAsString = response.asString();
		System.out.println("respoinseaAsString " + respoinseaAsString);

		/*
		 * To perform validation on response like status code or value, we need to get
		 * ValidatableResponse type of response using then() method of Response
		 */
		ValidatableResponse validatableResponse = response.then();
		validatableResponse.statusCode(200);
		validatableResponse.statusLine("HTTP/1.1 200 OK");

	}
}
