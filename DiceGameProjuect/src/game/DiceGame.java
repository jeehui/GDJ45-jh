package game;

public class DiceGame {
	
	private Player[] players;
	private int idx;
	
	public DiceGame(int Count) {
		players = new Player[Count];
	}
	public void join(Player player) {
		if(idx == players.length) {
			System.out.println("더 이상 참여할 수 없습니다.");
			return;
		}
		players[idx++] = player;
		
	}
	
	public void play() {
		int i = 0;
		while(true) {
			if(players[i].turn()) {
				System.out.println(players[i].getName() + "님 승리!");
				break;
			} else {
				i++; //다음 사람
				i %= players.length; //배열 인원수를 1로 돌아오기위해 모듈라 연산해야함.
			}
			
		}
	}
	
	
	
}
