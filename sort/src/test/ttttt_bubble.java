package test;

import java.util.Arrays;
import java.util.Scanner;

public class ttttt_bubble {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	String line = keyboard.nextLine();
	String[] datas = line.split(" ");
	int[] numbers = new int[datas.length];
	int j=0,a=0,ap=0;
	for(int i = 0; i < numbers.length; i++) {
		numbers[i] = Integer.parseInt(datas[i]);
	}
			//int[] numbers = {5,3,4,1,2,6,7,1,5,7,9,8,9,5,6,5,52};
			sort(numbers);
			System.out.println(Arrays.toString(numbers));
		
		}
	public static void sort(int[] numbers) {
		int i=0;
		for(int p=0;p<(numbers.length-1);p++){
		for(i=0;i<(numbers.length-1);i++) {
		if(numbers[i]>numbers[i+1]) {
			int temp=numbers[i];
			numbers[i]=numbers[i+1];
			numbers[i+1]=temp;
				}
			}
		}
	}
}


