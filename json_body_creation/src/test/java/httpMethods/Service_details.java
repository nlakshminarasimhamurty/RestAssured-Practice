package httpMethods;

import java.util.HashMap;
import java.util.LinkedHashMap;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
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

		LinkedHashMap <String, String> map = new LinkedHashMap <String, String>();

		JsonPath path = new JsonPath(skillDetailsResponce.asString());

		System.out.println(path.getString("dataObj.skill__id"));

		map.put("Skill_id", path.getString("dataObj.skill__id"));
		map.put("Skill_name", path.getString("dataObj.skill__description"));
		map.put("service_type", path.getString("dataObj.skill_ccs_features__service_type"));
		map.put("caller_id", path.getString("dataObj.skill__caller_id"));
		map.put("callback_phone", path.getString("dataObj.skill__callback_phone"));
		map.put("operator_phone", path.getString("dataObj.skill__operator_phone"));
		map.put("am_option", path.getString("dataObj.lvp_parameter__am_option"));
		map.put("scrub_wireless", path.getString("dataObj.lvp_parameter__scrub_wireless"));
		map.put("am_option", path.getString("dataObj.lvp_parameter__am_option"));
		map.put("acd_screenpop_id", path.getString("dataObj.skill_ccs_features__acd_screenpop_id"));

		System.out.println(map);

	}

}
