package test;

import java.util.Arrays;
import java.util.Scanner;

public class s {

	public static void main(String[] args) {
		int[] numbers = {11,22,33,44,55,66,77,88,99};
		int value = 77;
		int index = search(numbers, value);
		System.out.println(index);

	}
	public static int search(int[] numbers, int value) {
		int index = -1;
		int start = 0;
		int end = numbers.length - 1;
		
		while(start <= end) {
			int center = (start + end) / 2;
			if(numbers[center] == value) {
				index = center;
			//	break;
			}else if(numbers[center] > value) {
				end = center - 1;
			}else {
				start = center + 1;
			}
		}
		return index;
	}
}
