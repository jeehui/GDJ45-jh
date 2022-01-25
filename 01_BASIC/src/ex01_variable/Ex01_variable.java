package ex01_variable;

// single comment - 한 줄짜리 주석(설명)
/*
	multiple comment
	여러 줄의 주석
*/

/*
	1. 자바 이름 규정(naming convention)
		1) 프로젝트 : 마음대로
		2) 패키지 : 모두 소문자로 작성
		3) 클래스 : Upper Camel Case 
		4) 변수, 메소드 : Lower Camel Case
		5) 상수 : Snake Case 
	2. Naming Convention
		1) Upper Camel Case : MyName 
		첫 글자를 대문자로 나머지는 소문자
		두개의 단어를 사용했을 때 각 단어 첫 글자를 대문자로.
		2) Lower Camel Case : myName
		3) Snake Case : MY_NAME 전부 대문자이며 단어 사이에 _ 넣기   
*/

/*
	main 메소드(method)
	1. 자바 프로젝트가 실행되려면 반드시 필요하다.
	2. JVM(Java Virtual Machine)은 실행할 때 열려 있는 main 메소드를 실행한다.
	3. main 메소드를 못 찾으면 실행에 성공한 최근 main 메소드를 다시 실행한다.
	4. public static void main(String [] args) { }
	5. 클래스를 추가할 때 자동 등록하거나, 빠르게 자동완성 할 수 있다.
*/
public class Ex01_variable {

	public static void main(String[] args) {
		
		// 출력 방법
		//System.out.println(출력할내용) 출력 후 줄 바꿈
		//System.out.print(출력할내용) 출력만 함
		
		// 데이터 작성 방법(literal)
		// 단축키 sysout, syso 
		// 단축키 키는 하나이며 ctrl + space 이다.
		
		// 숫자
		System.out.println(45);
		System.out.println(1.5);
		System.out.println(45L);
		System.out.println(1.123456789);
		System.out.println(1.12345678901234567890);
		
		// 문자 (1글자)
		System.out.println('a');
		System.out.println('한');
		System.out.println('\n'); // 줄 바꿈 (역슬래시로 시작하는 문자 : 이스케이프)
		System.out.println('\''); // 작은 따옴표('')인식
		System.out.println('\"'); // 큰 따옴표("") 인식
		
		// 문자열 (여러 글자)
		System.out.println("hello");
		System.out.println("a");
		System.out.println(""); // 빈 문자열(공백 넣지 말기)
		
		// 논리 (참, 거짓)
		System.out.println(true);
		System.out.println(false);
	}
}
