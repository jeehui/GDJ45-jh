package ex03.arithmetic;

public class Ex04_operator {

	public static void main(String[] args) {
		
		// 복합 대입 연산
		// +=, -=, *=, /=, %=
		
		int wallet = 0;

		wallet = wallet + 30000; //기존 wallet의 값을 30000 늘림
		
		wallet += 30000; //동일한 코드
		
		System.out.println(wallet);
		
		// 문제. money를 5% 늘려보자.
		long money = 70000L;
		
		// money = money + (long)(money * 0.05);
	 // 정수     정수           실수 타입이기에 정수로 casting해줘야함
		
		// money += (long)(money * 0.05); //위 코드와 동일
		// money  = money + (long)(money * 0.05);
		
		//money = money * 1.05; 
		// 실수 연산 결과를 정수(long)타입에 저장할 수 없음
		
		money *= 1.05; //long과 double연산은 가능해서 식 성립
		//이 때 money는 JVM에 의해서 double타입으로 된다.
		
		System.out.println(money);
		
		
		
		
	}

}
