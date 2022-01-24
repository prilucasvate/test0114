import java.util.Scanner;

public class e462 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int a=sc.nextInt(),c;
		c=a*a;
		int ans[][]=new int[a][a];
		for(int i=1;i<=c;i++) {
		//	System.out.println(i);
		}
		
		
		int x=1;
		for(int t=0;t<=(a-1)*2;t++) {
			if(t<=(a-1)) {
			for(int i=0;i<=t;i++) {
		//		System.out.println(t-i+" "+i);
					if((t)%2==0) {
						ans[t-i][i]=x;
						x++;
					}else if((t)%2==1) {
						ans[i][t-i]=x;
						x++;
					}
			    }
			}//if(t<=(a-1))
			else {
				  for(int i=(a-1);i>(t-a);i--) {
					  if((t)%2==0) {
							ans[i][t-i]=x;
							x++;
						}else if((t)%2==1) {
							ans[t-i][i]=x;
							x++;
						}
				  }
				
				}
		}//for(int t=0;t<=(a-1)*2;t++)
			

		
		
		
		
		//----------------------------------------
		for(int i=1;i<=a;i++) {
			for(int s=1;s<=a;s++) {
				System.out.print(ans[i-1][s-1]+" ");
			}
			System.out.println();
		}	
		System.out.println();
		}

	}

}
