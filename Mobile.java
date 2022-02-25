package week1.day2;

public class Mobile {

	public void makeCall() {
	System.out.println("My first method-makeCall");
	}
	
		public void sendMsg() {
		System.out.println("My SendMessage Method");

	}
	public static void main(String[] args) {

		Mobile obj1 = new Mobile();
		obj1.makeCall();
		obj1.sendMsg();
		
		
	}

}
