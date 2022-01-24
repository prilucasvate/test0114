
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class d323 {

	public static void main(String[] args) throws IOException {
		Scanner br=new Scanner(System.in);
		
		int b=br.nextInt();
		ArrayList<Integer> aa = new ArrayList<Integer>();
		for(int i=0;i<b;i++) {
		aa.add(br.nextInt());
		
		}
		br.close();
		Collections.sort(aa);
		System.out.println(aa);
//		for(int i=0;i<b;i++) {
//		System.out.print(aa.get(i)+" ");
//		}
	
	}

}
