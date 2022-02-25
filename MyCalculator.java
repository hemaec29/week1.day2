package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = calculator.add(5, 5, 5);
		System.out.println("Sum of the numbers " + sum);
		
		int minus = calculator.sub(10, 5);
		System.out.println("Subtraction of the numbers " + minus);
		
		double product = calculator.mul(4, 4);
		System.out.println("Product of the numbers " + product);
		
		float div = calculator.divide(10, 2);
		System.out.println("Division of the numbers " + div);
		
		System.out.println("static method add result:" +Calculator.mod(1, 2));
	}

}
