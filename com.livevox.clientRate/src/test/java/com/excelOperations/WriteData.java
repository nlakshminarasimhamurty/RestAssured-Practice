package com.excelOperations;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static FileOutputStream fos;

	public static void witeDate(String filePath, String sheetName, Map<String, Object[]> map) {

		try {

			fos = new FileOutputStream(".//" + filePath + ".xlsx");
			workbook = new XSSFWorkbook();
			sheet = workbook.createSheet(sheetName);
			int rowCount = 0;
			Set<String> keys = map.keySet();

			for (String key : keys) {
				row = sheet.createRow(rowCount++);
				Object[] obj = map.get(key);

				int cellCout = 0;
				for (Object object : obj) {
					XSSFCell createCell = row.createCell(cellCout++);
					createCell.setCellValue((String) object);
				}

			}

			workbook.write(fos);

		} catch (Exception e) {

		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
