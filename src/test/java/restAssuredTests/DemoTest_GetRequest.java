package restAssuredTests;
import org.testng.annotations.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DemoTest_GetRequest {

	@Test
	public void GetIphoneDeatails()
	{
		given()
		.when()
			.get("https://dummyjson.com/products/1")
		.then()
			.statusCode(200)
			.assertThat().body("title", equalTo("iPhone 9"))
			.header("Content-Type", "application/json; charset=utf-8");
	}
}