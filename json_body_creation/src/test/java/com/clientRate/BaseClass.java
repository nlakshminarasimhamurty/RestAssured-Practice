package com.clientRate;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class BaseClass {

	// @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		RestAssured.baseURI = "https://portal.na4.livevox.com/";

		Response postRequest = RestAssured.given().content(ContentType.JSON).queryParam("client_code", "livevox")
				.queryParam("user", "nlakshminarasimhamurty").queryParam("pass", "livevox123").when()
				.post("lvp_10.0/login");

		Response clientRateResponse = RestAssured.given().content(ContentType.JSON).queryParam("operation", "get")
				.queryParam("client_id", "1011267").cookies(postRequest.getCookies()).get("/lvp_10.0/clientrate");

		JsonPath path = new JsonPath(clientRateResponse.asString());

		List<Object> list = path.getList("clientRate");

		Map<String, Object[]> map = new TreeMap<String, Object[]>();

		map.put("1", new Object[] { "Service_id", "Service_Name", "Service_Type", "Client_rate", "operator_rate" });
		for (int i = 2; i < list.size(); i++) {

			map.put("" + i,
					new Object[] { path.getString("clientRate[" + i + "].client_id"),
							path.getString("clientRate[" + i + "].name"), path.getString("clientRate[" + i + "].type"),
							path.getString("clientRate[" + i + "].ivr_rate"),
							path.getString("clientRate[" + i + "].operator_rate") });

		}

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet createSheet = workbook.createSheet("Clientrate");
		Set<String> keySet = map.keySet();
		int rowCout = 0;
		for (String key : keySet) {

			XSSFRow createRow = createSheet.createRow(rowCout++);
			Object[] objects = map.get(key);

			int cell = 0;
			for (Object obj : objects) {
				XSSFCell createCell = createRow.createCell(cell++);
				createCell.setCellValue((String) obj);

			}

			File file = new File(".//clientRate.xlsx");
			FileOutputStream fos = new FileOutputStream(file);
			workbook.write(fos);
			fos.close();

			System.out.println("added data");
		}
	}

}
