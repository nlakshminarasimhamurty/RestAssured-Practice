package httpMethods;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PutRequest {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("id", 10);
		obj.put("firstName", "Naveen");
		obj.put("lastName", "Kumar Sharma");

		Response putRequest = RestAssured.given().contentType(ContentType.JSON).body(obj.toString()).when()
				.put("http://localhost:3000/Friends/10");

		System.out.println(putRequest.statusCode());

		System.out.println(putRequest.asString());

	}

}
