package ex10_Quiz;

public class Ex10 {

	public static void main(String[] args) {
		
		Gun gun = new Gun("K2");
		Soldier soldier = new Soldier("람보",gun);
		
		soldier.shoot();
		soldier.shoot();
		soldier.shoot();
		
		soldier.reload(3);
		soldier.reload(6);
		soldier.reload(6);
		
		
		soldier.info();
	}

}
