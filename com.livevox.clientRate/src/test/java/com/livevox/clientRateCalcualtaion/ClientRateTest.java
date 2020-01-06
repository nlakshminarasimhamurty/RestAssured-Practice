package com.livevox.clientRateCalcualtaion;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.excelOperations.WriteData;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class ClientRateTest extends LoginTest {

	public Response clinetRateRequest;

	@Test
	public void getClinetRate() {

		clinetRateRequest = restApi.given().content(ContentType.JSON).queryParam("operation", "get")
				.queryParam("client_id", prop.getProperty("client_id")).cookies(LoginTest.loginCookies).when()
				.get("/lvp_10.0/clientrate");

		JsonPath path = new JsonPath(clinetRateRequest.asString());

		List<Object> list = path.getList("clientRate");

		Map<String, Object[]> map = new LinkedHashMap<String, Object[]>();

		map.put("1", new Object[] { "Service ID", "Service Name", "Service Type", "Client IVR", "Operator Ivr" });

		for (int i = 2; i < list.size(); i++) {

			map.put("" + i,
					new Object[] { path.getString("clientRate[" + i + "].client_id"),
							path.getString("clientRate[" + i + "].name"), path.getString("clientRate[" + i + "].type"),
							path.getString("clientRate[" + i + "].ivr_rate"),
							path.getString("clientRate[" + i + "].operator_rate") });

			System.out.println("Copied into Excel");
		}

		WriteData.witeDate(".//clientRate", "clientRate", map);
	}

}
