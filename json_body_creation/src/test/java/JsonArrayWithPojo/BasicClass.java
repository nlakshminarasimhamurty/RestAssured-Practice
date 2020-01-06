package JsonArrayWithPojo;

import java.util.ArrayList;

import complexJsonPojoClasses.Address;

public class BasicClass {

	private String firstName;
	private String LastName;
	private int id;
	private String Qualification;
	private Address Addresss;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public Address getAddresss() {
		return Addresss;
	}

	public void setAddresss(Address addresss) {
		Addresss = addresss;
	}

}
