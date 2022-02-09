package score;

import java.util.Scanner;

public class ScoreBook {
	
	private Scanner scanner;
	private Score[] sArray;
	
	public ScoreBook() {
		scanner = new Scanner(System.in);
	}
	
	private void ip() {
		System.out.println("総人数>>");
		int count = scanner.nextInt();
		sArray = new Score[count];
		for(int i=0; i < sArray.length; i++) {
			System.out.println("이름과 성적(이름과 번호는 빈 칸 없이 입력)>>");
			String name = scanner.next();
			int score = scanner.nextInt();
			sArray[i]= new Score(name, score); //sArray[i]배열에 새로 저장한다.
		}
		System.out.println("저장되었습니다.");
	}
	
	private String search(String name) {
		for(int i =0; i < sArray.length; i++) {
			if(name.equals(sArray[i].getName()))
				System.out.println(sArray[i].getScore());
	//타입이 달라서 오류가 떴는데 int 넣어도 다를게 없음
		} 
		return null;
	}
}
