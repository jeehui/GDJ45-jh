package ex07_constructor;

public class Rectangle {
	
	private int width;
	private int height;
	// private int area; 계산할 수 있는 항목이므로 필드로 둘 필요 없음
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public void info() {
		System.out.println("너비 " + width + ", 높이 " + height + ", 넓이" + getArea());
	}
	
}
