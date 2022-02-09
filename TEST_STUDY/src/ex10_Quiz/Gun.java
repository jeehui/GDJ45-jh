package ex10_Quiz;

public class Gun {
	
	private String model;
	private int bullet; //현재 총알
	private final int FULL_BULLET = 6; //최대 총알
	
	public Gun(String model) {
		this.model = model;
		this.bullet = bullet > FULL_BULLET ? FULL_BULLET : bullet; //최대 총알만큼만 저장 가능
	}
	
	//장전
	public void reload(int bullet) {
		this.bullet += bullet;
		if(this.bullet > FULL_BULLET)
			this.bullet = FULL_BULLET;
		
	}
	//쏘기
	public void shoot() {
		if(bullet <=0) {
			System.out.println("총알이 없다.");
			return;
		}
		bullet--;
		System.out.println("빵!" + bullet + "발 남았다.");
		}

	//출력
	public void info() {
		System.out.println(model + "(" + bullet + ")");
	}
	
	
	
}

