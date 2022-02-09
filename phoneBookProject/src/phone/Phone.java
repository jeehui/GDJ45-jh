package phone;

public class Phone {

	private String name;
	private String tel;
	
	public Phone() {
		
	}
	
	public Phone(String name, String tel) { //이 값이 필요하니까 무조건 넣어야함
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
}
