import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class a884 {

	public static void main(String[] args) {//a884
		Scanner scc =new Scanner(System.in);
		int n=Integer.parseInt(scc.nextLine());
		for(int i=0;i<n;i++) {
			String s=scc.nextLine();
			String w[]=s.split("\\s+");
			BigInteger a=new BigInteger(w[0]);
			BigInteger b=new BigInteger(w[1]);
			System.out.println(a.subtract(b));
		}
	

	}

}
