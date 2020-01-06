package complexJsonPojoClasses;

public class Address {

	private String village;
	private String city;
	private String state;
	private Parents parents;

	public Parents getParents() {
		return parents;
	}

	public void setParents(Parents parents) {
		this.parents = parents;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
