package Rest_Assured_Detail_Project.Rest_Assured_Detail_Project;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testGetREquest {

	@Test
	public void testGetReq() {
	
		String id="";
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employee/1";
		Response response=null;
		
		response=RestAssured.given().when().get();
		System.out.println("Response :" + response.asString());
		System.out.println("StatusCOde: "+ response.getStatusCode());
		
		assertEquals(200,response.getStatusCode());
		
		System.out.println("shashshahsah");
		System.out.println("shekhar");
	}
}
