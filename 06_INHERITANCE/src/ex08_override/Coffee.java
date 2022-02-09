package ex08_override;

public class Coffee {
	
	private String bean;
	
	public Coffee(String bean) {
		this.bean = bean;
	}
	//접근제어지시자(public), void(반환타입), taste(메소드이름), ()는 매개변수
	public void taste() {
		System.out.println("씹는맛");
	}
	
	public void info() {
		System.out.println("원두" + bean);
	}
	
	
}
