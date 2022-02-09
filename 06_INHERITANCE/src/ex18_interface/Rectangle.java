package ex18_interface;

public class Rectangle implements Shape {
	private int width;
	private int height;
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	@Override
	public void info() {
		System.out.println("넓이 " + getArea());
	}


	
	

}
