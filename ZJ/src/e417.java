import java.util.Scanner;

public class e417 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	while(sc.hasNext()) {
		int a=sc.nextInt();
		int []f=new int [a];
		int []s=new int [a];
		double temp=0;
		for(int e=0;e<a;e++) {
			s[(int) e]=0;
		}
		int ttl=0;
		for(int i=0;i<a;i++) {
			f[i]=sc.nextInt();
		}
		for(int l=0;l<a;l++) {
			for(int l2=l+1;l2<a;l2++) {
				temp=f[l]*f[l2];
				s[l]=(int) (s[l]+temp);
			}
		}
		for(int m=0;m<s.length;m++) {
			ttl=ttl+s[m];
		}
//		for(int l=0;l<s.length;l++) 
		System.out.println(ttl);

	}
	//}
}
