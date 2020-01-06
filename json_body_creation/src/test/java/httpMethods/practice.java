package httpMethods;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class practice {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		Response response = RestAssured.given().contentType(ContentType.JSON).when()
				.get("http://localhost:3000/Friends");

		// System.out.println(response.asString());

		JsonPath path = new JsonPath(response.asString());

		List<Object> list = path.getList("firstName");

		Map<String, Object[]> empinfo = new LinkedHashMap<String, Object[]>();

		for (int i = 0; i < list.size(); i++) {
			empinfo.put("" + i,
					new Object[] { path.getString("firstName[" + i + "]"), path.getString("lastName[" + i + "]") });
		}

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet createSheet = wb.createSheet("Pavan");

		int row = 0;
		int cell = 0;

		Set<String> keySet = empinfo.keySet();

		for (String set : keySet) {
			XSSFRow createRow = createSheet.createRow(row++);
			Object[] values = empinfo.get(set);

			for (Object val : values) {

				XSSFCell createCell = createRow.createCell(cell++);
				createCell.setCellValue((String) val);

			}

			FileOutputStream workbook = new FileOutputStream(new File(".//practice.xlsx"));
			wb.write(workbook);
			workbook.close();
			System.out.println("Writesheet.xlsx written successfully");

		}
	}

}
