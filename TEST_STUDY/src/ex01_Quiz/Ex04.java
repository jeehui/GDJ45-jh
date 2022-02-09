package ex01_Quiz;

import java.util.Scanner;

public class Ex04 {
	
	// exists()
		// 1. 발생한 난수가 기존 배열에 존재하는지 확인하는 메소드
		// 2. 존재하면 true, 존재하지 않으면 false 반환
	
	public static boolean exists(int arr[], int form, int rand) {
		
		for(int i = 0; i < form; i++) {
			if(arr[i] == rand)
				return true; //존재하면 true 리턴
		}
			return false; //중복이 없으면 for문이 끝난다.
		
	}
	
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 랜덤을 생성할까요? >>>");
		int n = sc.nextInt();
		
		int arr[] = new int[n]; // n개의 정수 배열 생성
		
		for(int i = 0; i < arr.length; i++) {
			int rand = (int)(Math.random() * 100) + 1; // 1~100범위의 난수
			//(int)(Math.random()*100)+1은 1~100사이를 의미함.
			// random 검사 메소드
			// 중복이 있으면 true 반환, 중복이 없으면 false 반환
			// exists(배열 arr, 인덱스, 난수) 
			if(exists(arr,i,rand)) { // 중복이 있다면
				i--; // 다시 난수를 발생시켜야 하므로 증가된 인덱스를 취소시킴
				//i++ 해버리면 위에 exists에서도 i++이기에 데이터가 사라짐.
				continue; //이걸 만나면 다시 for문으로 돌아감
			}
			arr[i] = rand; //난수를 배열에 저장
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0)
				System.out.println(arr[i] + "\t");
			else {
				if(i % 10 ==0) //10개 요소를 출력했다면
					System.out.println(); //다음 줄로 넘어가기
				System.out.println(arr[i] + "\t");
			}
		}
		sc.close();
	}
}
