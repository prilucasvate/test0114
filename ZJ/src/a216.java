import java.util.Scanner;

public class a216 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
		long a=sc.nextLong();
		long fa=0,ga=0;

		for(int i=0;i<=a;i++) {
			fa=fa+i;
			for(int k=0;k<=i;k++) {
				ga=ga+k;
				
			}
		}
		System.out.println(fa+" "+ga);
		
		}
	}

}
