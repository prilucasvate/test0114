import java.util.Scanner;

public class a291 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int psw[]=new int[4];
		int a=0,b=0;
		for(int i=0;i<4;i++) {
			psw[i]=sc.nextInt();
		}
		int tt[]=new int[4];
		int co=sc.nextInt();
		for(int i=0;i<co;i++) {
			for(int i1=0;i1<4;i1++) {
				tt[i1]=sc.nextInt();
			}
//			for(int i1=0;i1<4;i1++) {
//				System.out.println(tt[i1]);
//			}
			//-----------------------------------st
			int c=0;
			for(int r1=0;r1<4;r1++) {
				for(int e=r1+1;e<4;e++) {
				if(tt[r1]==tt[e]) {
					c++;
					break;
				}
			}
			}
			//-------
			for(int r=0;r<4;r++) {
				
			if(tt[r]==psw[r]){
				a++;
				//break;
			}else {
				for(int y=0;y<4;y++) {
					if(tt[r]==psw[y]) {
						b++;
						//break;
					}
				}
			}
	//		System.out.println(tt[r]+" "+psw[r]);
			}
		//	System.out.println(b+" "+c);
			System.out.println(a+"A"+(b-c)+"B");
			//System.out.println(11111);
			//-----------------------------------ed
			a=0;
			b=0;
			c=0;
		}
		}
	}

}
