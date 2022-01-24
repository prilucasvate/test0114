import java.math.BigInteger;
import java.util.Scanner;

public class f988 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			
			double m=sc.nextDouble();
			double n=sc.nextDouble();
			
			BigInteger up=new BigInteger("1");
			BigInteger down=new BigInteger("1");
			BigInteger BigInteger = new BigInteger("100000000");
			for(double u=m;u>n;u--) {
				Integer a1=new Integer((int) u);
				BigInteger tu=new BigInteger(a1.toString());
				up=up.multiply(tu);
			}
			for(double d=1;d<n+1;d++) {
				Integer a1=new Integer((int) d);
				BigInteger tdown=new BigInteger(a1.toString());
				down=down.multiply(tdown);
			}
			down=down.remainder(BigInteger);
			BigInteger ans = up.divide(down);
			System.out.println(down);
		}

	}

}
