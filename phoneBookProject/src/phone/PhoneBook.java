package phone;
import java.util.Scanner;
public class PhoneBook {
	
	private Scanner scanner;
	private Phone[] pArray;
	
	public PhoneBook() {
		
		scanner = new Scanner(System.in);
		
	}
	
	private void input() {
		System.out.println("인원수>>");
		int count = scanner.nextInt(); //다시
		pArray = new Phone[count]; //다시
		for(int i=0; i < count; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >>>");
			String name = scanner.next();
			String tel = scanner.next();
			pArray[i] = new Phone(name, tel); // 다시
		}
		System.out.println("저장되었습니다.");
	}
		private String search(String name) {
			
			for(int i=0; i < pArray.length; i++) {
				if(name.equals(pArray[i].getName()))
					return pArray[i].getTel();
			}
				return null;
	}
		
	public void run() {
	
		input();
		while(true) {
			System.out.println("검색할 이름>>");
			String name = scanner.next();
			if(name.equals("exit")) {
				System.out.println("프로그램 종료!");
				return; //while인 걸 잊지말구 void라서 return인거야
			}
			String tel = search(name);
			if(tel == null) 
				System.out.println(name + "이 없습니다.");
			else
				System.out.println(name + "의 번호는" + tel + "입니다.");
			
		}
			
	
	}
	
	/*private Scanner scanner;
	private Phone[] pArray; 
	
	public PhoneBook() {
		scanner = new Scanner(System.in); //생성자
	}

	private void input() {
		System.out.print("인원수>>");
		int count = scanner.nextInt();
		pArray = new Phone[count]; //배열 만드는 건 대괄호[]임
		for(int i = 0; i < count; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸 없이 입력) >>>");
			String name = scanner.next();
			String tel = scanner.next();
			//  1. 생성자
			pArray[i] = new Phone(name, tel);
			// 2. setter
			// pArray[i] = new Phone(); //내용이 없는 걸 저장하고
			// pArray[i].setName(name);
			// pArray[i].setTel(tel);
		}
		System.out.println("저장되었습니다.");
	}
	
	private String search(String name) {
		for(int i = 0; i < pArray.length; i++) {
			if(name.equals(pArray[i].getName()))
				return pArray[i].getTel();
		// pArray[i].getName 배열의 네임을 가져온다.
		}
		return null; // 찾다찾다 못차아서 for문을 종료하면 그 뒤에
		// null값을 반환한다.
	}
	
	public void run() {
		input();
		while(true){
			//무한 루프 while(true)
			System.out.println("검색할 이름>>> ");
			String name = scanner.next(); //next 넣는이유 이름이 공백이 없기에
			if(name.equals("exit")){
				System.out.println("프로그램 종료!");
				return; //break; void 안에 있으니까 return으로 썼지만 여기선 break 기능
			}
			//else 써도 됨
			String tel = search(name); //search 호출하고 방금 받았던 이름을 호출하겠다
			//서치함
			if(tel == null)
				System.out.println(name + "이 없습니다.");
			else
				System.out.println(name + "의 번호는 " + tel + "입니다.");
		*/
}
	

