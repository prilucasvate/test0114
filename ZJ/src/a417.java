import java.util.Scanner;

public class a417 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	//	for(int i=0;i<a;i++) {
			int b=sc.nextInt();
			int f=sc.nextInt();
			int co=1;
			int aa[][]=new int[b][b];
			//----------------------------------
			for(int l=0;l<aa.length;l++) {
				for(int h=0;h<aa.length;h++) {
					if(l==aa.length-1||h==aa.length-1) {
						
					}else if(l!=aa.length) {
						
					}else if(h!=aa.length) {
						
					}
				}
			}
			//-----------------------------------------------------------
			
			
			
			
			for(int k=0;k<aa.length;k++) {
				for(int j=0;j<aa.length;j++) {
					System.out.print(aa[k][j]+"     ");
				}
				System.out.println();
			}
			//------------------------------------------------------------
	//	}
		

	}

}
