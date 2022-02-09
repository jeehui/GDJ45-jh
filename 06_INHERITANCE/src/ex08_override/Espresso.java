package ex08_override;

//Espresso is a Coffee.

public class Espresso extends Coffee {
	
	private int water;
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	//Coffee 클래스의 기능인 taste, info를
	//Espresso 클래스가 그대로 사용할 수 없다.
	
	//이런 경우에는
	//Espresso 클래스가 taste, info를 다시 만들어 사용한다.
	
	// private < default < protected < public 순서대로 접근범위가 큼
	
	@Override //규칙지켜야함 슈퍼클래스의 메소드와 동일한 모습으로.
	public void taste() {
		System.out.println("쓰다");
	}
	
	@Override
	public void info() {
		//원두 정보 출력을 위해서 Coffee 클래스의 info메소드를 호출할 수 있다.
		// Coffee 클래스(info를 가져오려면) super키워드를 활용해서 사용할 수 있다.
		// 자기 info는 info() 부르고, 슈퍼클래스는 super.info() 임
		super.info();
		System.out.println("물" + water + "ml");
	}
	
}
