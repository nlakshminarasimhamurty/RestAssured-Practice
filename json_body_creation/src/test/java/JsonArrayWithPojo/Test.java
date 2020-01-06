package JsonArrayWithPojo;

import java.util.ArrayList;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import complexJsonPojoClasses.Address;
import complexJsonPojoClasses.Parents;

public class Test {

	public static void main(String[] args) {

		BasicClass m1 = new BasicClass();

		m1.setId(7);
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

		BasicClass m2 = new BasicClass();

		m2.setId(8);
		m2.setFirstName("Rahul");
		m2.setLastName("Shetty");
		m2.setQualification("MBA");
		Address add = new Address();
		add.setCity("Bangalore");
		add.setState("Banagalore");
		add.setVillage("Gundlahalli");

		Parents p2 = new Parents();
		p2.setFather_Name("Narasimha murty");
		p2.setMother_Name("Vimalamma");

		add.setParents(p1);
		m2.setAddresss(ad);

		ArrayList<BasicClass> lst = new ArrayList<BasicClass>();
		lst.add(m1);
		lst.add(m2);

		Response res = RestAssured.given().contentType(ContentType.JSON).body(lst).when()
				.post("http://localhost:3000/friends");

		System.out.println(res.statusCode());
		System.out.println(res.asString());

	}

}
