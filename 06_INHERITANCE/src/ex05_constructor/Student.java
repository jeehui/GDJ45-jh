package ex05_constructor;

public class Student extends Person {
	
	private String school;
				//생성자 만들고 매개변수인 name에 값을 넣는다. 그럼 그 값이 super(name)값에 들어간다.
	public Student(String name, String school) {
		//가장 먼저 Person 클래스의 생성자를 호출해야 한다.
		//서브 클래스에서 슈퍼 클래스의 생성자를 호출하는 방법
		//키워드 super로 사용한다.
		super(name); //Student 생성할 때 대입한 이름을 저 super에 넣어준다.
		//그럼 Person의 String name에 들어가진다.
		//public Person(String name){}호출하는 코드 Person클래스의 생성자호출
		this.school= school;
	
	}
	
	
	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public void study() {
		System.out.println(school + "학교다닌다.");
	}
	
}
