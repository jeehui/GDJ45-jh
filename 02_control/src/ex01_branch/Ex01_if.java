package ex01_branch;

public class Ex01_if {

	public static void main(String[] args) {
		
		int score = 100;
		
		//실행코드가 하나일 때 중괄호 안써도 됨/
		if(score >= 60) 
			System.out.println("합격");
		
		//실행코드가 다수일 때 중괄호 써야함.
		if(score >= 60) {
			System.out.println("합격");
			System.out.println("축하합니다");
		}
		
		// 문제. 남자는 왼쪽, 여자는 오른쪽
		
		String gender = "여자";
		
		if(gender.equals("남자")) 
			System.out.println("왼쪽");
		
		if(gender.equals("여자"))
			System.out.println("오른쪽");
		
		
		
	}

}
