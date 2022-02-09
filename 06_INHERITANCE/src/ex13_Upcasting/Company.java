package ex13_Upcasting;

import java.util.Scanner;

public class Company {
	
	private Scanner sc;
	private Employee[] employees;
	private int idx;
	
	public Company(int employeeCount) {
		sc = new Scanner(System.in);
		employees = new Employee[employeeCount];
	}
	
	
	// 추가
	public void addEmployee() {
		System.out.println("===직원 추가===");
		if(idx == employees.length) {
			System.out.println("가득찼습니다.");
			return;
		}
		System.out.println("유형(1. 정규 2. 임시 3. 영업)>>> ");
		switch(sc.nextInt()) {
		case 1:
			employees[idx++] = new Regular("이대리", 200);
			break;
		case 2:
			employees[idx++] = new Temporary("김주임", 1, 300);
			break;
		case 3:
			employees[idx++] = new Sales("정과장", 50, 1000, 0.1);
			break;
		}
		System.out.println("직원이 추가되었습니다.");
	}
	
	// 삭제
	public void removeEmployee() {
		System.out.println("===직원 삭제===");
		System.out.println("삭제할 직원 번호(1~" + idx + ") >>>");
		int findNo = sc.nextInt() -1; //미리 findNO = index와 같게 만듦
		if(findNo < 0 || findNo > idx) {
			System.out.println("없는 직원입니다.");
			return;
		}
		System.arraycopy(employees, findNo +1, employees, findNo, idx-1 -findNo);
		idx--;
		employees[idx] = null;
		System.out.println("삭제됐습니다.");
	}
	
	// 수정
	public void modifyEmployee() {
		System.out.println("===직원 수정===");
		System.out.println("수정할 직원 번호(1~" + idx + ") >>>");
		int findNo = sc.nextInt();
		if(findNo < 1 || findNo > idx) {
			System.out.println("없는 직원입니다.");
			return;
		}
		System.out.println("새로운 직원 이름 입력 >>>");
		String name = sc.next(); //이름의 공백이 없다면 next
		employees[findNo-1].setName(name);
		System.out.println("이름이 수정되었습니다.");
	}
	
	
	// 조회
	public void findEmployee() {
		System.out.println("===직원 조회===");
		System.out.println("조회할 직원 번호(1~" + employees.length + ") >>> ");
		int findNo = sc.nextInt();
		if(findNo < 1 || findNo > idx) {
			System.out.println("없는 직원입니다.");
			return;
		}
		System.out.println(employees[findNo-1].getName() + " " + employees[findNo -1].getPay() + "만원"); //1번 직원은 인덱스 0을 쓰기에 -1
	}
	
	// 전체 조회
	public void findAllEmployee() {
		//5분: 모든 직원의 이름과 급여를 조회하시오.
		System.out.println("===전체 직원 조회===");
		if(idx == 0) {
			System.out.println("직원이 없습니다.");
			return;
		}
		for(Employee emp : employees) {
			if(emp != null)
				System.out.println(emp.getName() + " " + emp.getPay());
		}
	}
	
	
	//메뉴
	public void menu() {
		System.out.println("1.추가 2.삭제 3.수정 4.조회 5.전체 조회 6.종료");
	}
	
	//실행
	public void manage() {
		while(true) {
			menu();
			System.out.println("선택 >>> ");
			switch(sc.nextInt()) {
			case 1: addEmployee(); break;
			case 2: removeEmployee(); break;
			case 3: modifyEmployee(); break;
			case 4: findEmployee(); break;
			case 5: findAllEmployee(); break;
			case 0: System.out.println("프로그램 종료!"); return; // public void manage를 끝내겠단 소리
			default: System.out.println("잘못된 선택입니다!");
			}
		}
	}
	
}
