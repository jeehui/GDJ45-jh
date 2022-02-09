package ex04_has_a;

public class Radio {
	
	private Remocon remocon; //필드값 null값
	//null값 없애기 위해 아래 식을 씀.
	public Radio(Remocon remocon) {
		this.remocon = remocon;
	}
	
	public void up() {
		remocon.up();
	}
	public void down() {
		remocon.down();
	}
	
}
