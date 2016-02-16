package myclasses;

public class SecondPhone implements Telephone{
	private String number = "911";
	public SecondPhone(){}
	public SecondPhone(String number){
		this.number = number;
		
	}

	public void call() {
		System.out.println("calling"+" "+number);
		
	}

}
