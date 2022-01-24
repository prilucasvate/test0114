package test;

import java.util.Arrays;

public class t {

	public static void main(String[] args) {
		int[] numbers = {2,4,1,9,7,99,3,6,8};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));

	}
	public static void sort(int[] numbers) {
		for(int k = 0 ; k < numbers.length - 1 ; k++) {
			int smallestIndex = k;
			for(int i = k + 1; i < numbers.length; i++) {
				if(numbers[smallestIndex] > numbers[i]) {
					smallestIndex = i;
				}
			}
			int temp = numbers[k];
			numbers[k] = numbers[smallestIndex];
			numbers[smallestIndex] = temp;
		}
		
		/*
		smallestIndex = 1;
		for(int i = 2; i < numbers.length; i++) {
			if(numbers[smallestIndex] > numbers[i]) {
				smallestIndex = i;
			}
		}
		temp = numbers[1];
		numbers[1] = numbers[smallestIndex];
		numbers[smallestIndex] = temp;
		
		
		smallestIndex = 2;
		for(int i = 3; i < numbers.length; i++) {
			if(numbers[smallestIndex] > numbers[i]) {
				smallestIndex = i;
			}
		}
		temp = numbers[2];
		numbers[2] = numbers[smallestIndex];
		numbers[smallestIndex] = temp;
		*/


	}

}
