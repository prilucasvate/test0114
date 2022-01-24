import java.util.Arrays;
import java.util.Scanner;

public class a746 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long aa[][] = new long[a][2];
		long b[] = new long[a];

		for (int j = 0; j < a; j++) {
			for (int k = 0; k < 2; k++) {
				aa[j][k] = sc.nextLong();
			}
		}
		// ------------------------
		for (int j = 0; j < a; j++) {
			b[j] = aa[j][0] * 10000000000L + aa[j][1];
		}
		Arrays.sort(b);
		for (int j = 0; j < a; j++) {
			//System.out.prlongln(b[j]);
			long gg=b[j]/10000000000L;
			System.out.print(gg+" ");
			System.out.println(b[j]-gg*10000000000L);
		}

	}

}
