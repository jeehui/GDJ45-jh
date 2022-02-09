package prac2;

public class Student {

	//field
	private String name;
	private Exam[] exams; // Exam[] exams = new Exam[2] 위와 아래 나눔
	private int idx;
	
	// constructor
	public Student(String name) {
		this.name = name;
		exams = new Exam[2];
	}
	
	// method
	public void doExam(Exam ex) {
		if(idx == exams.length)
			return;
		exams[idx++] = ex; //배열 0번 1번에 값이 들어갈 수 있도록 증가시켜줌.
	}
	public double getAverage() {
		//각 Exam의 인스턴스 : exams[0], exams[1]
		//각 Exam의 평균	 : exams[0].getAverage(), exams[1].getAverage()
		double total = 0;
		for(int i =0; i < idx; i++)
			total += exams[i].getAverage();
		return total/idx;
	
	}
	public String getGrade() {
		double average = getAverage();
		if(average >= 90)
			return "A";
		else if(average >= 80)
			return "B";
		else if(average >= 70)
			return "C";
		else if(average >= 60)
			return "D";
		else
			return "F";
	}
	
	
	public void info() {
		System.out.println("학생명: " + name);
		//각 Exam인스턴스 : exam[0], exam[1]
		//각 Exam의 정보  : exam[0].info(), exams[1].info()
		for(int i = 0; i < idx; i++) {
			System.out.println("===" + (i + 1) + "번째 시험 정보===");
			exams[i].info();
		}
		
		System.out.println("최종 평균 및 학점 " + getAverage() + "점(" + getGrade() + "학점");
	}
		
}
