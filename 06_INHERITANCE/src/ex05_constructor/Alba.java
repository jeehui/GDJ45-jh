package ex05_constructor;

public class Alba extends Student {
	
	private String company;
	
	public Alba(String name, String school, String company) {
		//Student클래스의 생성자를 "먼저" 호출해야 한다.
		super(name, school); //슈퍼는 언제나 먼저 호출
		this.company = company;
	}
	
	
	
	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public void work() {
		System.out.println(getName() + "가 " + company + "에서 일한다.");
	}
	
}
