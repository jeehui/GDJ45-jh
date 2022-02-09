package ex01_Quiz;

public class Ex06 {

	public static void main(String[] args) {
		
		//도개걸윷모 -> 배열에 저장, 이동횟수를 인덱스와 일치시켜서 상ㅇ
		String[] yutnori = {"", "도", "개", "걸", "윷", "모"};
		
		int total = 0; // 0으로 초기화
		
		while(true) {
			//이동횟수 == 인덱스 -> 난수 처리
			int move = (int)(Math.random()*5) + 1; //1~5
			
			// 이동횟수 누적
			total += move;
			
			if(move<=3) {
				System.out.println(yutnori[move] + ", " + total + "칸 이동한다.");
				break;
			}
			else {
				System.out.print(yutnori[move] + ", ");
			}
		}
			
		
		
	}

}
