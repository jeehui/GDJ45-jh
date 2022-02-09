package ex07_constructor;

//정사각형은 사각형이다.
//Square is a Rectangle.

public class Square extends Rectangle {
	
	// field
	// 없다.
	
	//생성자 필요함.
	public Square(int n) {
		super(n, n);
	}

}
