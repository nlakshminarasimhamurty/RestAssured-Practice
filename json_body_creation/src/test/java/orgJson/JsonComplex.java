package orgJson;

public class JsonComplex {

	private String firstName;
	private String lastName;
	private String Qualification;
	private double height;
	private double weight;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private AddressDetails AddressDetails;
	private parentDetails parentDetails;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public AddressDetails getAddressDetails() {
		return AddressDetails;
	}

	public void setAddressDetails(AddressDetails addressDetails) {
		AddressDetails = addressDetails;
	}
	public parentDetails getParentDetails() {
		return parentDetails;
	}

	public void setParentDetails(parentDetails parentDetails) {
		this.parentDetails = parentDetails;
	}
}
