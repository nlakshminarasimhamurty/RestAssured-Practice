package httpMethods;

import java.util.List;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class Login {

	public static void main(String[] args) {

		

		RestAssured.baseURI = "https://na3.livevox.com/";

		Response postRequest = RestAssured.given().content(ContentType.JSON).queryParam("client_code", "livevox")
				.queryParam("user", "nlakshminarasimhamurty").queryParam("pass", "livevox123").when()
				.post("lvp_10.0/login");

		System.out.println(postRequest.statusCode());
		System.out.println(postRequest.contentType());
		System.out.println(postRequest.sessionId());

		Response clientRequest = RestAssured.given().content(ContentType.JSON).cookies(postRequest.getCookies())
				.queryParam("operation", "get_detail").queryParam("client_id", "18512").when().get("/lvp_10.0/client");

		System.out.println(clientRequest.getStatusCode());

		System.out.println(clientRequest.asString());

		JsonPath path = new JsonPath(clientRequest.asString());

		List<Object> list = path.getList("dataObj.availableVoices");

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}

	}

}
