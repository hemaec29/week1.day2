package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(array);
		System.out.println(array.length);
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] != i+1 ) {
				System.out.println(i+1);
				break;
			}
		}

	}
}