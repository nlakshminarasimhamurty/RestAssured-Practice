package collectionsPractice;

public class Employee {
	
	String name;
	String email;
	int deptno;

	public Employee(String name,String email,int deptno) {
		this.name=name;
		this.email=email;
		this.deptno=deptno;

	}
	
	public String toString() {
		return name + " " + email + " "+deptno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
