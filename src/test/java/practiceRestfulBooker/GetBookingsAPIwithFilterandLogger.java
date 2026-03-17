package practiceRestfulBooker;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.APILogger;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetBookingsAPIwithFilterandLogger {

	@Test
	public void getBookingsAPIandvalidatewithResponse() {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";
		RequestSpecification request = RestAssured.given().filter(new APILogger());

		Response response = request.get("/booking");

		Assert.assertEquals(response.getStatusCode(), 200, "Passed");

	}
}
