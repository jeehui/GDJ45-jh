package ex13_Upcasting;

public class Employee {
	
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getPay() { //getPay가 있는 이유는 직원들이(알바든 뭐든)다 돈을받기때문에
		return 0;
	}
	
}
