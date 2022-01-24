import java.util.ArrayList;
import java.util.Scanner;

public class g005 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String line=sc.nextLine();
		String []datas=line.split("");
		String numbers[]=new String[datas.length+1];
		for(int i=0;i<datas.length;i++) {
			numbers[i]=datas[i];
		}
		numbers[datas.length]="+";
		int dl=datas.length+1,ee=0;
		//--------------------------------
	xx:	for(int ii=0;ii<dl;ii++) {
			if(numbers[ii].equals("+")||numbers[ii].equals("-")||numbers[ii].equals(numbers[dl-1])) {
				for(int yy=0;yy<ii;yy++) {
					System.out.print(numbers[yy]+"");
					
				}
				break xx;
			}
	}
		//--------------------------------
		for(int a=0;a<dl;a++) {
	zz:	for(int i=ee;i<dl;i++) {
			if(numbers[i].equals("+")||numbers[i].equals(numbers[dl-1])) {
				for(int p=i+1;p<dl;p++) {
					if(numbers[p].equals("+")||numbers[p].equals("-")||numbers[p].equals(numbers[dl-1])) {
						ee=p;
						for(int y=i+1;y<p;y++) {
							System.out.print(numbers[y]+"");
						}
						break zz;
					}
				}
			}else if(numbers[i].equals("-")||numbers[i].equals(numbers[dl-1])) {
				for(int p=i+1;p<dl;p++) {
					if(numbers[p].equals("+")||numbers[p].equals("-")||numbers[p].equals(numbers[dl-1])) {
						ee=p;
						for(int y=p-1;y>i;y--) {
							System.out.print(numbers[y]+"");
						}
						break zz;
					}
				}
			}
		}
		}
		
		
	}

}
