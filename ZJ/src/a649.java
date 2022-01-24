import java.util.Scanner;

public class a649 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int n=sc.nextInt();
		int m=sc.nextInt();
		int aa[][]=new int[n][n];
		int ee[][]=new int[m][4];
		int ans[]=new int[m];
		int temp=0,x=0,y=0;
		for(int l=0;l<aa.length;l++) {
			for(int h=0;h<aa.length;h++) {
				aa[l][h]=sc.nextInt();		
			}
		}
		for(int l=0;l<ee.length;l++) {
			for(int h=0;h<4;h++) {
				ee[l][h]=sc.nextInt();		
			}
		}
		//-----------
		for(int l=0;l<m;l++) {
		x=ee[l][2]-ee[l][0]+1;//width
		y=ee[l][3]-ee[l][1]+1;//length
		int cc=0,dd=0;//initial position
		cc=ee[l][0]-1;
		dd=ee[l][1]-1;
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				ans[l]=ans[l]+aa[i+cc][j+dd];
			}
		}
			System.out.println(ans[l]);
		}
		//--------
		}
	}

}
