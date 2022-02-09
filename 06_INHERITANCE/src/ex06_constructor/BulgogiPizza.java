package ex06_constructor;

// 상속 관계의 클래스들도 
// 생성자 작성은 이클립스에게 맡긴다.

// 1. 서브 클래스에 필드(field)가 있는 경우
//	 [source] - [Generate Constructor using Fields]

// 2. 서브 클래스에 필드(field)가 없는 경우
//	 [source] - [Generate Constructors from Superclass]

public class BulgogiPizza extends Pizza {
	
	private String bulgogiOrigin;
	
	public BulgogiPizza(String dough, int cheese, String bulgogiOrigin) {
		super(dough, cheese);
		this.bulgogiOrigin = bulgogiOrigin;
	}
	public void info() {
		System.out.println(getDough() + " 도우, 치즈 " + getCheese() + "g " + bulgogiOrigin);
	}
	
	
}
