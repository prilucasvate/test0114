import java.math.BigInteger;
import java.util.Scanner;

public class b115 {

	public static void main(String[] args) {
		Scanner scc =new Scanner(System.in);
		while(scc.hasNext()) {
		String w[]=new String[3];
		w[0]=scc.next().trim();
		w[1]=scc.next().trim();
		w[2]=scc.next().trim();
			BigInteger a=new BigInteger(w[0]);
			BigInteger b=new BigInteger(w[2]);
			if(w[1].equals("*")) {
				System.out.println(a.multiply(b));
			}else if(w[1].equals("/")) {
				System.out.println(a.divide(b));
			}
			
		
		}	

	}

}
