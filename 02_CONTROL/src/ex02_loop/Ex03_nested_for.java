package ex02_loop;

public class Ex03_nested_for {

	public static void main(String[] args) {
		
		// 1일차 1교시 수업입니다.
		// 1일차 2교시 수업입니다.
		// ...
		// 3일차 8교시 수업입니다.
	/*	
		for(int day = 1; day<=3; day++)
			for(int hour = 1; hour<=8; hour++)
				System.out.println(day + "일차" + hour + "교시 수업입니다.");
	*/	
		
		// 문제. 2단부터 9단까지 모두 출력하기
		// 각 단 사이에 ------------------ 출력하기
		for(int dan = 2; dan<=9; dan++) {
			for(int dan2 = 1; dan2<=9; dan2++)
				System.out.println(dan + "x" + dan2 + "=" + (dan*dan2));
			System.out.println("------------");
		} //구구단 한 파트씩 끝나면 아래 ------를 출력하겠다는 괄호. 
		
		
		
		
		
		
		
	}

}
