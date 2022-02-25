package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int inputNum = 14;
		boolean flag =false;
				
		for (int j = 2; j <= inputNum/2; j++) 
		{
			if(inputNum % j ==0) {
				flag =true;
				System.out.println(inputNum+ " is not a Prime Number");
				break;
				
		}
		}
		
		if (flag==false)
		System.out.println(inputNum+ " is a Prime Number");
		
	
	}
}
