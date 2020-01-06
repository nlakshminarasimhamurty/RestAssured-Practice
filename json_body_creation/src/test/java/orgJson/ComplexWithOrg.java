package orgJson;

import org.json.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ComplexWithOrg {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("firstName", "Raghuvaran");
		obj.put("lastName", "Btec");
		obj.put("Qualification", "Engineering");
		obj.put("height", 5.6);
		obj.put("weight", 65.8);
		obj.put("id", 24);

		
		JSONObject obj1 = new JSONObject();
		obj1.put("Village", "Dandapalya");
		obj1.put("Taluk", "Pavagada");
		obj1.put("State", "Karnataka");
		obj1.put("post", "Gundlahalli");
		obj1.put("pincode", 561202);
		obj1.put("district", "Tumkure");


		JSONObject obj2 = new JSONObject();
		obj2.put("Father Name", "LakshmiNarasimha murty");
		obj2.put("Mother Name", "Vimala");
		obj2.put("Father age", 56);
		obj2.put("mother age", 51);


		JSONObject obj3 = new JSONObject();
		obj3.put("City", "chitradurga");
		obj3.put("State", "Karnataka");

		JSONObject obj4 = new JSONObject();
		obj4.put("City", "Tumkure");
		obj4.put("State", "Karnataka");

		obj.put("AddressDetails", obj1);
		obj.put("parentDetails", obj2);
		obj2.put("MotherAddress", obj3);
		obj2.put("FatherAddress", obj4);

		Response res = RestAssured.given().contentType(ContentType.JSON).body(obj.toString()).when()
				.post("http://localhost:3000/Friends");

		System.out.println(res.statusCode());
		System.out.println(res.asString());

	}

}
