package restAssuredTests;

import org.testng.annotations.*;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

public class DemoTest_PostRequest 
{
	@Test
	public void userDetails()
	{
		String requestBody = 
				"{"+" \n "+" \"name\": \"Sachin\", \n "+" \"job\": \"Automation engineer\" "+"}";
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.basePath="/users";
		
		
		
		given()
		.contentType("application/json")
		.body(requestBody)
		
		.when()
		.post()
		
		.then()
		.statusCode(201);
	}
}
