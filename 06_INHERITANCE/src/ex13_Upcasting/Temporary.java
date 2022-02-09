package ex13_Upcasting;

public class Temporary extends Employee{
	
	private int payPerHour; //시급
	private int times;
	
	public Temporary(String name, int payPerHour, int times) {
		super(name);
		this.payPerHour = payPerHour;
		this.times = times;
	}
	@Override
	public int getPay() {
		return payPerHour * times;
	}
	
}
