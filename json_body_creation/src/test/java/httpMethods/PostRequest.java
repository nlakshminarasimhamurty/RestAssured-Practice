package httpMethods;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("id", 26);
		obj.put("firstName", "Naveen");
		obj.put("lastName", "Kumar Sharma");

		Response putRequest = RestAssured.given().contentType(ContentType.JSON).body(obj.toString()).when()
				.post("http://localhost:3000/Friends");

		System.out.println(putRequest.statusCode());

		System.out.println(putRequest.asString());

	}

}
