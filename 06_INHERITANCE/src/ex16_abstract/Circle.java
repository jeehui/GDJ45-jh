package ex16_abstract;

public class Circle extends Shape {
	
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	
}
