package practice;

import org.json.JSONObject;

public class LoginData {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("Client_code", "livevox");
		obj.put("userName", "Naveen");
		obj.put("password", "Livevox12345");

		String string = obj.toString();
		System.out.println(string);

	}

}
