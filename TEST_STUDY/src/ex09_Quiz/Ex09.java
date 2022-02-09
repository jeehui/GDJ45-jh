package ex09_Quiz;

public class Ex09 {

	public static void main(String[] args) {
		
		BankAccount me = new BankAccount("1234", 10000);
		BankAccount mom = new BankAccount("4321", 100000);
		
		me.deposit(10000); //내 계좌에 10000원 입금
		me.deposit(-100); //내 계좌에 마이너스 입금 (불가)
		
		me.withdraw(5000);
		me.withdraw(100);
		
		me.inquiry();
		
		mom.transfer(me, 50000);
		mom.transfer(me, -100);
		mom.transfer(me, 100000000);
		
		me.inquiry();
		mom.inquiry();
		
	}

}
