package ex10_Quiz;

public class Soldier {

	private String name;
	private Gun gun;
	
	public Soldier(String name, Gun gun) {
		super();
		this.name = name;
		this.gun = gun;
	}
	
	public void reload(int bullet) {
		gun.reload(bullet);
	
	}
	
	public void shoot() {
		gun.shoot();
	}
	
	public void info() {
		System.out.println(name + " : ");
		gun.info();
	}
	
	
}
