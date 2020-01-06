package orgJson;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class SimpleJsonWithORGJSON {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();

		obj.put("First Name", "LakshmiKanth");
		obj.put("Last Name", "HN");
		obj.put("id", 1);

		System.out.println(obj);
		Response post = RestAssured.given().contentType(ContentType.JSON).body(obj.toString()).when()
				.post("http://localhost:3000/Friends");

		System.out.println(post.statusCode());

		System.out.println(post.asString());
	}

}
