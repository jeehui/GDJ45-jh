package ex01_Quiz;

import java.util.Scanner;

public class Ex02_Quizadd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("누구 오시인가요?");
		String hito = sc.next();
		String[] kumi = new String[] {"봄", "여름", "가을", "겨울"};
		String name = "히가";
		
		switch(hito) {
		
		case "사쿠야" : case "마스미" : case "츠즈루" :
		case "시트론" : case "이타루" : case "치카게" :
			System.out.println(name + "님은 " + kumi[0] + "조의 " + hito + " 오시입니다.");
			break;
		case "텐마" : case "유키" : case "무쿠" :
		case "미스미" : case "카즈나리" : case "쿠몬" :
			System.out.println(name + "님은 " + kumi[1] + "조의 " + hito + " 오시입니다.");
			break;
		case "반리" : case "쥬자" : case "오미" :
		case "타이치" : case "사쿄" : case "아자미" :
			System.out.println(name + "님은 " + kumi[2] + "조의 " + hito + " 오시입니다.");
			break;
		case "츠무기" : case "타스쿠" : case "히소카" :
		case "호마레" : case "아즈마" : case "가이" :
			System.out.println(name + "님은 " + kumi[3] + "조의 " + hito + " 오시입니다.");
			break;
		default:
			System.out.print(hito + "는 만카이 극단원이 아닙니다.");
		}
		
		sc.close();
		
	}

}
