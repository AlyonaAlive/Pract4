package myclasses;

public class FirstPhone implements Telephone {
	private String number = "911";
	public FirstPhone(){}
	public FirstPhone(String number){
		this.number = number;
		
	}

	public void call() {
		System.out.println("calling"+" "+number);
		
	}

}
