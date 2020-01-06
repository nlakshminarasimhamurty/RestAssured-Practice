package livevox;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Service_details {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://na3.livevox.com/";

		Response loginResponce = RestAssured.given().content(ContentType.JSON).queryParam("client_code", "livevox")
				.queryParam("user", "nlakshminarasimhamurty").queryParam("pass", "livevox123").when()
				.post("lvp_10.0/login");

		Response skillDetailsResponce = RestAssured.given().content(ContentType.JSON)
				.cookies(loginResponce.getCookies()).queryParam("operation", "get_skill_detail")
				.queryParam("client_id", "33204").queryParam("skill_id", "114546").when().get("lvp_10.0/skill");

		System.out.println(skillDetailsResponce.asString());

	}

}
