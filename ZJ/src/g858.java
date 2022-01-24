import java.util.Scanner;

public class g858 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		if(a%4==0) {
			if(a%400==0||a%100!=0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}
		
	}

}
