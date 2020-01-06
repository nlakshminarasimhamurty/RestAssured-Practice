package orgJson;

public class parentDetails {

	private String fatherName;
	private String motherName;
	private int fatherage;
	private int motherage;
	private FatherAddress fatheraddress;
	private MotherAddress motherAddress;

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getFatherage() {
		return fatherage;
	}

	public void setFatherage(int fatherage) {
		this.fatherage = fatherage;
	}

	public int getMotherage() {
		return motherage;
	}

	public void setMotherage(int motherage) {
		this.motherage = motherage;
	}

	public FatherAddress getFatheraddress() {
		return fatheraddress;
	}

	public void setFatheraddress(FatherAddress fatheraddress) {
		this.fatheraddress = fatheraddress;
	}

	public MotherAddress getMotherAddress() {
		return motherAddress;
	}

	public void setMotherAddress(MotherAddress motherAddress) {
		this.motherAddress = motherAddress;
	}

}
