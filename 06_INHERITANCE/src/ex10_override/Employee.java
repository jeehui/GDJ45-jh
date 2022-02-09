package ex10_override;

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
	
	public int getPay() {
		return 0; //아직 값이 정해지지 않았기에 0으로 잡음.
	}
	
	
	
}
