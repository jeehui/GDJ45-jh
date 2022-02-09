package ex09_Quiz;

public class BankAccount {
	
	//field
	private String accNo; // 계좌번호
	private long balance; // 잔액
	
	//constructor
	public BankAccount(String accNo, long balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	
	//입금
	public void deposit(long money) {
		if(money <= 0) {
			return; // 생성자는 반환타입이 없지만 void타입은 반환 가능
		}
		balance += money;
	}
	// 출금
	// 1) 결과타입 : long  (실제로 출금된 금액)
	// 2) 메소드명 : withdraw
	// 3) 매개변수 : long money  (출금해야 될 금액)
	public boolean withdraw(long money) {
		if(money <= 0 || money > balance) {
			return false; //출금된 금액이 0원이다.
		}
		balance -= money;
		return true;
	}
	
	// 이체               클래스는 자기가 만든 타입이므로 other은 EX09의 me 값을 저장함
	public void transfer(BankAccount other, long money) {
		// 출금 후 입금 순서로 동작해야 함.
		// 내 계좌에 출금하기: withdraw(money)
		// 상대 계좌에 입금하기: other.deposit(money)
		// 이체: 내 계좌에 출금된 금액만큼만 상대 계좌에 입금하기
		if(this.withdraw(money)) //출금을 호출해서 True면 반환
			other.deposit(money);
		
	}
	//조회
	void inquiry() {
		System.out.println("계좌번호" + accNo + "잔액" + balance + "원");
	}
	
}
