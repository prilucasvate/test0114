import java.util.Scanner;

public class Ne470 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
		int a=sc.nextInt();
		double b=0,c=0;
		while(a>0)
			b=1.0/a;
			//System.out.println(b);
			c=c+b;
			a--;
		}
		
		//System.out.println(Math.round(c*1000.0)/1000.0);
		}
	}


