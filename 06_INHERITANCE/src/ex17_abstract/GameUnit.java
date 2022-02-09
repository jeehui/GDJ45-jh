package ex17_abstract;

public abstract class GameUnit {
	
	private String name;
	private int energy;
	private int power;
	private boolean alive; //boolean isAlive와 같다
	public GameUnit(String name, int energy, int power) {
		super();
		this.name = name;
		this.energy = energy;
		this.power = power;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	// 수정
	public void setEnergy(int energy) {
		this.energy = energy;
		if(this.energy < 0) // 생명력이 마이너스로 떨어지지 않기 위해
			this.energy = 0;
		setAlive(this.energy >0);
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public boolean isAlive() { // boolean타입은 get붙지 않고 is붙음.
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public abstract void attack(GameUnit unit); 
	//유닛이 다르기 때문에 메소드가 없는 공통적인 추상메소드로 통일
	
	
}
