package ex16_abstract;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	public Rectangle(String name, int width, int hegith) {
		super(name);
		this.width = width;
		this.height = hegith;
	}
	@Override
	public double getArea() {
		return width * height;
	}
	
	
	
}
