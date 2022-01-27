package ex03_constructor;

public class ComputerMain {

	public static void main(String[] args) {
		
		// Computer 클래스의 인스턴스 com 생성
		
		Computer com = new Computer("LG", "gram", 200); //생성자 호출
		// 생성자 : 생성할 때 사용하는 메소드
		
		System.out.println(com.maker);
		System.out.println(com.model);
		System.out.println(com.price);
		
	}

}
