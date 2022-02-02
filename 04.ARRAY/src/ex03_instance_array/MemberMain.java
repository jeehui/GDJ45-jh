package ex03_instance_array;

public class MemberMain {
	
	//static 메소드는 static 메소드만 호출할 수 있다.
	public static void m1() {
	}
	public static void m2() {
	}
	public static void m3() {	
	
		Member[] members = new Member[3];
		String[] ids = {"apple", "banana", "corn"};
		String[] names = {"사과", "바나나", "옥수수"};
		
		for(int i = 0; i < members.length; i++) {
			members[i] = new Member(ids[i], names[i]);
		}
		
		for(Member member : members)
			System.out.println(member.getUserId() + ", " + member.getName());
		
		
	}
		
	public static void main(String[] args) {
		m3();
	}
	
}
