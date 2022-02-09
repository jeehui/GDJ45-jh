package ex07_Quiz;

import java.util.Scanner;

public class Player {
	
		private Scanner sc;
		private String name;
		
		public Player(String name) {
			sc = new Scanner(System.in);
			this.name = name;
	}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		//엔터와 엔터사이의 시간을 초로 반환하는 메소드
		public double turn() {
			System.out.println(name + "님 시작하려면 <Enter>키를 누르세요.");
			sc.nextLine(); // <Enter>키 입력
			long begin = System.currentTimeMillis();
			System.out.println("10초가 된 것 같으면 <Enter>키를 누르세요.");
			sc.nextLine();
			long end = System.currentTimeMillis();
			return ((end - begin)/1000);

		}
}
