import java.util.Arrays;
import java.util.Scanner;

public class c561 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int[] b=new int[a];
		String[] s=new String[a];
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
			s[i]=Integer.toString(b[i]);
			StringBuilder stb=new StringBuilder(s[i]);
			s[i]=stb.reverse().toString();
			b[i]=Integer.parseInt(s[i]);
		}
		Arrays.sort(b);
		
		
		System.out.print(b[a-1]);
	}
}
