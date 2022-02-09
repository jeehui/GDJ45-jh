package ex09_override;

public class Circle extends Shape{
	
	private double radius;

	public Circle(String type, double radius) {
		super(type);
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
			// 파이 코드,   제곱 코드
	}
	@Override
	public void info() {
		super.info();
		System.out.println("반지름 " + radius + ", 넓이 " + getArea());
	}
	
}
