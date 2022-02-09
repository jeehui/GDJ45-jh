package ex14_Downcasting;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Alba();
		
		p.eat();
		
		//((Alba)p).study();
		//((Alba)p).work(); 
		//upcasting 문제점을 override 뿐만 아니라 downcasting으로 해결 가능하다.
		
		if(p instanceof Alba) { //p는 Alba 인스턴스인가?
			p.study(); // if문으로 downcasting 코드 안써도 끌어올수있다.
			((Alba)p).work(); 
		}
	}

}
