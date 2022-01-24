import java.util.Scanner;

public class a148 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int a=sc.nextInt();
		double ttl=0;
		
			for(int i=0;i<a;i++) {
				double t=sc.nextDouble();
				ttl=ttl+t;
			}
			if(ttl/a<=59) {
				System.out.println("yes");	
			}else {	
				System.out.println("no");	
			}
		
		}

	}
}