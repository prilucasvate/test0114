package test;

import java.util.Arrays;

public class tttt {

	public static void main(String[] args) {
		int[] numbers = {2,3,4,1,5};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	
	}
public static void sort(int[] numbers) {
	for(int q=1;q<numbers.length;q++) {
	for(int p=q;p>0;p--) {
		if(numbers[p]<numbers[p-1]) {
			int temp=numbers[p];
			numbers[p]=numbers[p-1];
			numbers[p-1]=temp;
			}else {
				break;
			}
		}
	  }
    }
}
