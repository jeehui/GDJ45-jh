package ex10_override;

public class Main {

	public static void main(String[] args) {
		
		Regular r = new Regular("이대리", 200);
		
		System.out.println("직원명 " + r.getName() + ", 급여 " + r.getPay() + "만원");
		
		Temporary t = new Temporary("김알바", 1);
		t.setTimes(52 * 4); //setTimes를 불러서 정보 입력, get은 그곳에 저장된 값을 불러오는건가..
		System.out.println("직원명 " + t.getName() + ", 급여 " + t.getPay() + "만원");
		
		Sales s = new Sales("최주임", 50);
		s.setSalesVolume(1000); //판매금액
		s.setIncentive(0.1);
		System.out.println("직원명 " + s.getName() + ", 급여 " + s.getPay() + "만원");
		
	}

}
