package ex01_Quiz;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		String[] names = {"피카츄", "뽀로로", "브레드"};
		int[] scores = new int[names.length];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< scores.length; i++) {
			System.out.println(names[i] + "의 점수 입력>>>");
			scores[i] = sc.nextInt();
		}
		
		// 첫번째 학생의 점수를 합계, 최대, 최소값으로 세팅해서 기본값하기
		//합계, 최대, 최소
		int total = scores[0];
		int max = scores[0];
		int min = scores[0];
		int top = 0;
		int bottom = 0;
		
		//i가 1인 이유가 0 인덱스인 학생을 기본값했기 때문에 1부터임
		//변수 top은 학생 번호를 저장해둔 값임.
		for(int i = 1; i < scores.length; i++) {
			total += scores[i];
			if(max < scores[i]) {
				max = scores[i];
				top = i;
			}
			//최소보다 더 작은 값이 있는지 확인하기위해
			if(min > scores[i]) {
				// 0인덱스 학생(min)보다 작은 인덱스가 나오면 min에 저장해라
				min = scores[i];
				bottom = i;
			}
		
		}
		System.out.println("평균: " + (double)total/scores.length + "점");
		System.out.println("1등" + names[top]);
		System.out.println(scores.length + "등" + names[bottom]);
		
		sc.close();
		
	}
	
	
}
