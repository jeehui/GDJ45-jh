package prac2;

public class Tv {

	//field
	private Remocon remocon; //null -> setRemocon덕에 형태화됨.

	
	//method (setRemocon이 있기 때문에 생성자 띄어두기)
	public Remocon getRemocon() {
		return remocon;
	}

	public void setRemocon(Remocon remocon) {
		this.remocon = remocon;
	}
	
	public void chUp() {
		remocon.chUp();
		
	}
	public void chDown() {
		remocon.chDown();
	}
	public void volUp() {
		remocon.volUp();
	}
	public void volDown() {
		remocon.volDown();
	}
}
