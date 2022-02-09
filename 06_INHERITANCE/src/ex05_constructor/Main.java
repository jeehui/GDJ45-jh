package ex05_constructor;

public class Main {

	public static void main(String[] args) {
		
		Alba alba = new Alba("영수", "서울대", "도서관");
		
		alba.eat();
		alba.study();
		alba.work();
		
		//gettersetter를 이용해서 아래와 같이 문장 만들기가 가능함.
		//alba는 총 9개의 메소드를 가지고 있어서 하나의 alba로 불러들일 수 있다.
		System.out.println(alba.getName() + "가 " + alba.getSchool() + "학교에 다닌다.");
		
	}

}
