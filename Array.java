package week1.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] values =  {10,20,40,60,80,30,50};
		// other way to declare
		// int[] values = new int[6];
		
		//values[0] = 10;
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
		Arrays.sort(values);
	
		//find the biggest value in the array
		
		System.out.println("Greatest number in the array is" +values[values.length-1]);

	
	}

}
