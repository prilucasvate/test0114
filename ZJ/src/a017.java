import java.util.ArrayList;
import java.util.Scanner;

public class a017 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String line=keyboard.nextLine();
		String []datas=line.split(" ");
		String numbers[]=new String[datas.length];
		for(int i=0;i<datas.length;i++) {
			numbers[i]=datas[i];
		}
		int ans=0;
		int []inumbers=new int[datas.length];
		for(int i=0;i<numbers.length-3;i+=2) {
			inumbers[i]=Integer.parseInt(numbers[i]);
			 //--------------------------------
				System.out.print(inumbers[i]);
			switch(numbers[i+1]) {
			case "+":
				inumbers[i+2]=inumbers[i+2]+inumbers[i];
				System.out.println(inumbers[i+2]+inumbers[i]);//-------------------------
				break;
//			case "-":
//				inumbers[i+2]=inumbers[i+2]-inumbers[i];
//				break;
//			case "*":
//				inumbers[i+2]=inumbers[i+2]*inumbers[i];
//				break;
//			case "/":
//				inumbers[i+2]=inumbers[i+2]/inumbers[i];
//				break;
//			case "%":
//				inumbers[i+2]=inumbers[i+2]%inumbers[i];
//				break;
			}
		}
		for(int l=0;l<inumbers.length;l++) 
			System.out.print(inumbers[l]);
		
	}

}
