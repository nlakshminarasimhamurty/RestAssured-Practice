package emailCreationApplicatrion;

public abstract class GeneralEmail implements IBasicInfo {

	private String firstname;
	private String lastName;
	private String department;
	private String company;
	private String emailAddress;
	private int mailBoxCapcity;

	public GeneralEmail(String firstname, String lastName, String department, String company) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.department = department;
		this.company = company;

	}

	public void getEmployeeInfo() {
		System.out.println("firstName : " + firstname + "\n last Name : " + lastName + "\n department : " + department
				+ "\n company : " + company);
	}

	public void setFirstName(String name, String lastName) {
		this.firstname = firstname;
		this.lastName = lastName;

	}

	private String genarateEmailAddress() {
		if (department.equalsIgnoreCase("Sales")) {
			emailAddress = firstname + "." + lastName + "@" + department + "." + company + ".com";

		} else if (department.equalsIgnoreCase("devolopment")) {
			emailAddress = firstname + "." + lastName + "@" + department + "." + company + ".com";

		} else if (department.equalsIgnoreCase("accounting")) {
			emailAddress = firstname + "." + lastName + "@" + department + "." + company + ".com";

		} else {
			emailAddress = firstname + "." + lastName + "@" + company + ".com";

		}
		return emailAddress;
	}

	public String getEmailAddress() {
		return genarateEmailAddress();
	}
	
	public void setMailBoxCapacity(int mailBox) {
		this.mailBoxCapcity=mailBox;
	}
	public int getMaiiBoxCapcity() {
		return mailBoxCapcity;
	}
	public String FullName() {
		return firstname+" "+ lastName;
	}

}
