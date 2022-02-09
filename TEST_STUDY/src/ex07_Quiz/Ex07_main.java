package ex07_Quiz;

public class Ex07_main {

	public static void main(String[] args) {

		Player player[] = new Player[2];
		player[0] = new Player("강아지");
		player[1] = new Player("고양이");
		
		double duration1 = player[0].turn();
		double duration2 = player[1].turn();
		
		System.out.print(player[0].getName() + "님 결과 " + duration1 + "초 ");
		System.out.print("" + player[1].getName() + "님 결과 " + duration2 + "초, 승자는 ");
		
		//Math.abs는 절댓값
		if(Math.abs(10 - duration1)< Math.abs(10 - duration2)) //시간 간격이 작은 사람이 이김
			System.out.println(player[0].getName() + "님입니다.");
		else
			System.out.println(player[1].getName() + "님입니다.");
	}

}
