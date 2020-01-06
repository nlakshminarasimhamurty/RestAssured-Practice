package livevox;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Cookies;
import com.jayway.restassured.response.Response;

public class Login {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("client_code", "livevox");
		obj.put("user", "nlakshminarasimhamurty");
		obj.put("pass", "livevox123");

		RestAssured.baseURI = "https://na3.livevox.com/";

		Response postRequest = RestAssured.given().content(ContentType.JSON).body(obj.toString()).when()
				.post("lvp_10.0/login");

		System.out.println(postRequest.statusCode());

		System.out.println(postRequest.asString());

		/*
		 * Cookies detailedCookies = postRequest.getDetailedCookies();
		 * 
		 * System.out.println(detailedCookies.toString());
		 */
	}

}
