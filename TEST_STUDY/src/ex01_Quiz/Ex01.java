package ex01_Quiz;

public class Ex01 {

	public static void main(String[] args) {
	
		int score = 65;
		int grade = 4;
				
		if(score >= 60 && grade <= 3)
			System.out.println("합격!");
		else if(score >= 70 && grade == 4)
			System.out.println("합격!");
		else 
			System.out.println("불합격!");
		
		
	}

}
