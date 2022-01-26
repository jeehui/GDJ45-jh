package ex04.logic;

public class Ex01_logic {

	public static void main(String[] args) {

		// 크기 비교
		// > , < , >=, <=, ==, !=
		// 연산 결과는 true 아니면 false (boolean)
		//              1            0  값이 없는 걸 false로 봄
		
		int a = 10;
		int b = 9;
		
		boolean res1 = a > b;
		boolean res2 = a < b;
		boolean res3 = a >= b;
		boolean res4 = a <= b;
		boolean res5 = a == b;
		boolean res6 = a != b;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		
		
	}

}
