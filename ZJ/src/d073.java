import java.util.Scanner;

public class d073 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
		int a=sc.nextInt();
		int c=0;
		if(a%3==0) {
			c=a/3;
			System.out.println(c);
		}else {
			c=a/3+1;
			System.out.println(c);
		}
		}
	}

}
