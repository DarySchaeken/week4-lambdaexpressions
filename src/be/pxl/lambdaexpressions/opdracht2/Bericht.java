package be.pxl.lambdaexpressions.opdracht2;

public class Bericht {
	private String text;
	
	public Bericht() {
		
	}
	
	public Bericht(String text) {
		this.text = text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String encrypt(Encryptie encryptie){
		return encryptie.apply(text);
	}

}
