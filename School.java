package quiz01;

public class School {
	
	//필드 field 는 앞에 private
	private String name;
	private String location;
	
	//생성자 constructor은 public
	//오른 우클릭 source에 generate constructor using field 클릭
	public School() {
		
	}

	public School(String name, String location) {
		this.name = name;
		this.location = location;
	}

	
	// 메소드 method
	// 오른 우클릭 source에 generate getters and setters 클릭
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
	