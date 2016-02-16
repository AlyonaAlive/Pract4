package myclasses;

public class SuperPhone implements Telephone {
	public SuperPhone(){}
	
	public void call() {	
		System.out.println("my message - "+message);
		firstSF.share();
	}
	private String message;
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	private ShareFile firstSF;
	public void setFirstSF(ShareFile firstSF) {
		this.firstSF = firstSF;
	}

}
