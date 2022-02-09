package ex08_Quiz;

public class Watch { //이 문제의 요점을 모르겠음
	
	private int hour; //0~23
	private int minute; //0~59
	private int second;  //0~59
	
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void addHour(int hour) {
		if(hour<0) {
			return; //addHour 메소드 종료
		}
		// this.hour : 16시
		// hour : 25시
		// this.hour + hour : 41시
		// (this.hour + hour) % 24: 17시
		this.hour += hour; //this.hour초기값, hour은 hour속 배열 수
		this.hour %= 24;
	}
	// 1시간 몫, 1초 나머지로 본다.
	public void addMinute(int minute) {
		if(minute<0) {
			return;
		}
		this.minute += minute;
		// 시간: this.minute / 60
		// 분:   this.minute % 60
		this.minute += minute; // 15분 + 61분 도합 76분
		addHour(this.minute / 60); // 76분 / 60분 :1시간
		this.minute %= 60; //76분 % 60분: 16분
			
		}
	public void addSecond(int second) {
		if(second<0) {
			return;
		}
		this.second += second;
		// 분 : this.second / 60
		// 초 : this.second % 60
		addMinute(this.second / 60);
		this.second %= 60;
	}
	public void see() {
		System.out.println(hour + "시" + minute + "분" + second + "초");
	}
	
}
