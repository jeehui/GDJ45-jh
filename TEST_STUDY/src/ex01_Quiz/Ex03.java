package ex01_Quiz;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] count = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		for(int i = 0; i < unit.length ; i++) {
			count[i] = money / unit[i];
		
		if(count[i] > 0) {
			System.out.println(unit[i] + "원 짜리 : " + count[i] + "개");
			money %= unit[i];
		
			}
		
		}
		
		sc.close();
	}

}
