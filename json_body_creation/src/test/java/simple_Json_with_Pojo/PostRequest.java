package simple_Json_with_Pojo;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) {

		/*
		 * SimpleBodyUsingPOJO pojo = new SimpleBodyUsingPOJO();
		 * 
		 * pojo.setFirstName("raghu"); // pojo.setId(10); pojo.setLastName("varma");
		 */

		JSONObject obj = new JSONObject();
		obj.put("id", 14);
		obj.put("firstName", "Naveen kumar");
		obj.put("lastName", "Sharma");

		System.out.println(obj);
		System.out.println(obj.toString());

		Response res = RestAssured.given().contentType(ContentType.JSON).body(obj.toString()).when()
				.post("http://localhost:3000/friends");

		System.out.println(res.statusCode());
		System.out.println(res.asString());

	}

}
