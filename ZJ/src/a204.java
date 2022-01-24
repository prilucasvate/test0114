import java.math.BigInteger;
import java.util.Scanner;

public class a204 {

	public static void main(String[] args) {
		Scanner scc =new Scanner(System.in);
		while(scc.hasNext()) {
		String b=scc.next().trim();
			BigInteger a=new BigInteger(b);
		String b1="1";
			BigInteger a1=new BigInteger(b1);
			for(int i=3;i<90;i+=2) {
				for(int i1=1;i1<=i;i1++) {
					String b2=i1+"";
					BigInteger a2=new BigInteger(b2);
					a1=a1.multiply(a2);
				}
				double b3=Math.pow(i, i);
//				BigInteger a2=new BigInteger(b2);
//				a=a.subtract();
			}
			
		
		}
	}
}
