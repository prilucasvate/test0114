import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b374 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int[] s=new int[30001];
		for(int ss:s)
        	s[ss]=0;
		int[] num=new int[30001];
		
		for(int y=0;y<a;y++) {
			s[sc.nextInt()]++;
			
		}
		for(int sss:num)
        	num[sss]=s[sss];
		Arrays.sort(num);
	zz:	for(int e=1;e<10;e++) {
			if(num[0]==s[e]) {
				System.out.println(num[0]+" "+s[e]);
				//break zz;
			}else {
				
			}
		}
//		for(int y=0;y<10;y++) {
//			System.out.println(" "+ s[y]);
//		}
	}

}
