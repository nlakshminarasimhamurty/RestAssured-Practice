package httpMethods;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class DeleteRequest {

	public static void main(String[] args) {

		Response putRequest = RestAssured.given().contentType(ContentType.JSON).when()
				.delete("http://localhost:3000/Friends/12");

		System.out.println(putRequest.statusCode());

		System.out.println(putRequest.asString());

	}

}
