import java.util.Scanner;

public class e31999999 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] aa=new int[a];
		int[] aaa=new int[500000000];
		String num[]=new String[a];
		for(int i=0;i<a;i++) {
			aa[i]=sc.nextInt();
			for(int q=0;q<i;q++) {
				if(aa[i]==aa[q]) {
					aaa[i]=aa[i];
				}
			}
		}
		int tt=0;
		for(int i=0;i<a;i++) {
			for(int s=0;s<a;s++) {
				if(aa[i]!=aaa[s]) {
					
				}
			}
		}
		for(int i=0;i<a;i++) {
			System.out.println(aaa[i]);
		}
	}

}
