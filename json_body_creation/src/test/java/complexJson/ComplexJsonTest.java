package complexJson;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import complexJsonPojoClasses.Address;
import complexJsonPojoClasses.MainClass;
import complexJsonPojoClasses.Parents;

public class ComplexJsonTest {

	public static void main(String[] args) {

		MainClass m1 = new MainClass();

		m1.setId(6);
		m1.setFirstName("Rahul");
		m1.setLastName("Shetty");
		m1.setQualification("MBA");
		Address ad = new Address();
		ad.setCity("Bangalore");
		ad.setState("Banagalore");
		ad.setVillage("Gundlahalli");

		Parents p1 = new Parents();
		p1.setFather_Name("Narasimha murty");
		p1.setMother_Name("Vimalamma");

		ad.setParents(p1);
		m1.setAddresss(ad);

		Response res = RestAssured.given().contentType(ContentType.JSON).body(m1).when()
				.post("http://localhost:3000/friends");

		System.out.println(res.statusCode());
		System.out.println(res.asString());

	}

}
