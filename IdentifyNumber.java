package week1.day2;

public class IdentifyNumber {

	public void postiveOrNegative() {
		int i = 10;
			if (i>0)
				System.out.println("Given number is Positive number");
			else
				System.out.println("Given Number is Negative number");
	}
	public static void main(String[] args) {
	
		IdentifyNumber PON = new IdentifyNumber();
		PON.postiveOrNegative();
		
		int input =50;
		
		if(input%2 == 0)
System.out.println("Even number");
		else
			System.out.println("Odd number");
	}

}
