package game;

import java.util.Arrays;

public class Player {
	
	private String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean turn() {
		int n[] = new int[3];
		for(int i=0; i < n.length; i++) {
			n[i]= (int)(Math.random() * 6 +1);
		}
		System.out.println("===" + name + "님의 주사위 결과===");
		System.out.println(Arrays.toString(n));
		if(n[0] == n[1] && n[1] == n[2]) {
			System.out.println(" 성공!");
			return true;
		} else {
			System.out.println(" 실패!");
			return false;
		}
	}
	
}
