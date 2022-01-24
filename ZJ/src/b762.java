import java.util.ArrayList;
import java.util.Scanner;

public class b762 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int k=0,kk=0,dd=0,aa=0;
		ArrayList<String> bb = new ArrayList<String>();
		for(int i=0;i<a;i++) {
		bb.add(sc.next());
		}
		for(int i=0;i<a;i++) {
			if(bb.get(i).indexOf("K")>-1) {
				kk++;
				k++;
				switch(k) {
				case 0:
					break;
				case 1:
					System.out.println("You have slain an enemie.");
					break;
				case 2:
					System.out.println("You have slain an enemie.");
					break;
				case 3:
					System.out.println("KILLING SPREE!");
					break;
				case 4:
					System.out.println("RAMPAGE~");
					break;
				case 5:
					System.out.println("UNSTOPPABLE!");
					break;
				case 6:
					System.out.println("DOMINATING!");
					break;
				case 7:
					System.out.println("GUALIKE!");
					break;
				default:
					System.out.println("LEGENDARY!");
					break;
				}
			}else if(bb.get(i).indexOf("D")>-1) {
				dd++;
				if(k>=3) {
					System.out.println("SHUTDOWN.");
				}else {
					System.out.println("You have been slained.");
				}
				k=0;
			}else if(bb.get(i).indexOf("A")>-1) {
				aa++;
			}
		}
		System.out.println(kk+"/"+dd+"/"+aa);

	}

}
