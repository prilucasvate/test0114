package test;

import java.util.Arrays;


public class ttt {

	

		public static void main(String[] args) {
			int[] numbers = {5,4,1,9,3,6,2,7,8};
			sort(numbers);
			System.out.println(Arrays.toString(numbers));
		}
		public static void sort(int[] numbers) {
			for(int p = 1; p < numbers.length; p++) {
				int q = -1;
				for(int i = 0; i < p; i++) {
					if(numbers[i] > numbers[p]) {
						q = i;
						break;
					}
				}
				if(q != -1) {
					int temp = numbers[p];
					for(int i = p; i > q; i--) {
						numbers[i] = numbers[i - 1];
					}
					numbers[q] = temp;
				}
			}
		}
	}


