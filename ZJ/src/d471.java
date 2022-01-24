import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class d471 {

	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext()) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a;
		list.add(sc.nextInt());
		Collections.sort(list);
		a=list.get(0);
		int c=(int) Math.pow(2, a);
		long g;
		String x;
		
		for(int i=0;i<c;i++) {
			x=Integer.toBinaryString(i);
		//	g=Integer.parseInt(x);
			g=Long.parseLong(x);
			switch(a) {
			case 0:
				System.out.printf("%d\n",g);
				break;
			case 1:
				System.out.printf("%d\n",g);
				break;
			case 2:
				System.out.printf("%02d\n",g);
				break;
			case 3:
				System.out.printf("%03d\n",g);
				break;
			case 4:
				System.out.printf("%04d\n",g);
				break;
			case 5:
				System.out.printf("%05d\n",g);
				break;
			case 6:
				System.out.printf("%06d\n",g);
				break;
			case 7:
				System.out.printf("%07d\n",g);
				break;
			case 8:
				System.out.printf("%08d\n",g);
				break;
			case 9:
				System.out.printf("%09d\n",g);
				break;
			case 10:
				System.out.printf("%010d\n",g);
				break;
			case 11:
				System.out.printf("%011d\n",g);
				break;
			case 12:
				System.out.printf("%012d\n",g);
				break;
			case 13:
				System.out.printf("%013d\n",g);
				break;
			case 14:
				System.out.printf("%014d\n",g);
				break;
			case 15:
				System.out.printf("%015d\n",g);
				break;
			}
			
		
		}

	}
	
	}
}
