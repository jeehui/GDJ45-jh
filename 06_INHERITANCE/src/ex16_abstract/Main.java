package ex16_abstract;

public class Main {

	public static void main(String[] args) {
		
		// Shape shape = new Shape("도형");
		
		Shape rectangle = new Rectangle("사각형", 3, 4);
		System.out.println(rectangle.getName() + rectangle.getArea());
		
		Shape circle = new Circle("원", 1.5);
		System.out.println(circle.getName()+ circle.getArea());
		
	}	

}
