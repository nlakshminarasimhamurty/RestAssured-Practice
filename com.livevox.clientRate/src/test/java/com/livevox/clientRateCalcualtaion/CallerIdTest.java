package com.livevox.clientRateCalcualtaion;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.excelOperations.WriteData;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class CallerIdTest extends LoginTest {

	public RestAssured rest;

	@SuppressWarnings("static-access")
	@Test
	public void getSkillDetails() {

		rest.baseURI = prop.getProperty("url");

		Response responseData = rest.given().content(ContentType.JSON).cookies(LoginTest.loginCookies)
				.queryParam("operation", "get_skill_detail").queryParam("client_id", prop.getProperty("client_id"))
				.queryParam("skill_id", "1032967").when().get(prop.getProperty("endPoint"));

		JsonPath path = new JsonPath(responseData.asString());

		Map<String, Object[]> map = new LinkedHashMap<String, Object[]>();

		System.out.println(path.get("dataObj.skill__operator_phone"));

		map.put("1",
				new Object[] { "Service Name", "OPERATOR PHONE", "CALLBACK PHONE", "CALLER ID", "AGENT CALL IN NUMBER",
						"Caller ID Source ID", "Service Answering Machine Option", "Zip/Area Mismatch",
						"Default Wireless Call Supression at Service-level", "preffred Routing",
						"Click Distribution routing type", "Queuer Name" });

		map.put("" + 2, new Object[] { path.getString("dataObj.skill__description"),
				path.getString("dataObj.skill__operator_phone"), path.getString("dataObj.skill__callback_phone"),
				path.getString("dataObj.skill__caller_id"), path.getString("dataObj.skill__agent_call_in_number"),
				path.getString("dataObj.skill_ccs_features__callerid_source_id"),
				path.getString("dataObj.lvp_parameter__am_option"),
				path.getString("dataObj.skill_ccs_features__zip_area_mismatch"),
				path.getString("dataObj.lvp_parameter__scrub_wireless"),
				path.getString("dataObj.skill_ccs_features__preferred_routing"),
				path.getString("dataObj.skill_ccs_features__preferred_click_distribution"),
				path.getString("dataObj.queuerxclient__queuer_name") });

		WriteData.witeDate("Service Details", "Skill info", map);

	}

}
