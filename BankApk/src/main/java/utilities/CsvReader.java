package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class CsvReader {
	
	 
	
	public static List<String[]> dataReader(String file){
		String datarow;
		List<String[]> data= new LinkedList<String[]>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			 while((datarow=reader.readLine())!=null) {
			 String[] values= datarow.split(",");
			 data.add(values);
			}
			 reader.close();
		} catch (Exception e) {
			
		}
		return data;
		
	}
}
