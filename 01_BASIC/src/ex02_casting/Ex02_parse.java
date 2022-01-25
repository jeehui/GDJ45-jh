package ex02_casting;

public class Ex02_parse { //parse가 분석이라는 의미

	public static void main(String[] args) {
		
		// 1. "100" -> 100 바꿀 때가 있음.
		String str1 = "100";
		int a = Integer.parseInt(str1); //Integer에서 . 을 붙으면 목록이 나옴
		System.out.println(a);
		
		// 2. "200" -> 200L
		String str2 = "200";
		long b = Long.parseLong(str2);
		System.out.println(b);
		
		// 3. "1.5" -> 1.5
		String str3 = "1.5";
		double c = Double.parseDouble(str3);
		System.out.println(c);
		
	}

}
