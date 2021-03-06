package ex04_instance_array;

public class Company {

		private Employee[] employees; //배열
		private int idx; // 인덱스(자동으로 최초 0값을 가짐), 실제로는 직원 수를 의미함.
		
		public Company(int n) {
			employees = new Employee[n];
		}
		public void addEmployee(Employee employee) {
			if(idx == employees.length) {
				System.out.println("더 이상 직원을 뽑을 수 없습니다.");
				return; //addEmployee 메소드 종료 
				// 반환타입이 void인 메소드는 return이란 코드를 사용해서 종료 가능함.
			}
			employees[idx++] = employee;
		// Employee employee = new Employee(,,); 분리된 상황
		}
		public void printAllEmployee() {
		System.out.println("총 직원 수는 " + idx + "명입니다.");
		for(Employee employee : employees) {
			if(employee != null)
				System.out.println(employee.getName() + "(" +employee.getDept() + ")");
		}
	} 
	public void inquiry(String name) {
		if(idx == 0) {
			System.out.println("조회할 직원이 없습니다.");
			return;
		}
		for(Employee employee : employees) {
			if(employee != null) {
				if(employee.getName().equals(name)) {
					System.out.println("검색된 직원: " + employee.getName() + "(" + employee.getDept() + ")");
				}
			}
		}	
	}
	
	public void fireEmployee(String name, String dept) {
		if(idx == 0) {
			System.out.println("해고할 직원이 없습니다.");
			return;
		}
		boolean exist = false;
		for(int i = 0; i < idx; i++) {
			if(employees[i].getName().equals(name) && employees[i].getDept().equals(dept)) {
				for(int j = i; j < idx -1; j++) {
					employees[j] = employees[j + 1];
				}
				idx--;
				employees[idx] = null; //한줄로 employee[--idx] = null;
				exist = true;
			} //해고되어 빈칸이 된 걸 앞으로 땡기는 반복문
		}
		if(exist == false) //if(!exist)
			System.out.println(name + "(" + dept + ") 직원이 존재하지 않습니다.");
		else
			System.out.println(name + "(" + dept + ") 직원이 해고되었습니다.");
 }		

}
