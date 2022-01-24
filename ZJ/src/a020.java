
import java.util.Arrays;
import java.util.Scanner;

public class a020 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String line=keyboard.nextLine();
		String []datas=line.split("");
		int numbers[]=new int[datas.length];
		for(int i=1;i<datas.length;i++) {
			numbers[i]=Integer.parseInt(datas[i]);
		}
		int et=0,eo=0,ttl=0;
		et=ck(datas[0])/10;
		eo=ck(datas[0])-(et*10);
		ttl=et+eo*9+numbers[1]*8
				   +numbers[2]*7
				   +numbers[3]*6
				   +numbers[4]*5
				   +numbers[5]*4
				   +numbers[6]*3
				   +numbers[7]*2
				   +numbers[8]*1
				   +numbers[9];
		if(ttl%10==0) {
			System.out.println("real");
		}else {
			System.out.println("fake");
		}
				

	}
	//----------------------------------------------------------------
	public static int ck(String a) {
	//	System.out.println("....");
		int e=0;
		switch(a){
		case "A":
			e=10;
			break;
		case "B":
			e=11;
			break;
		case "C":
			e=12;
			break;
		case "D":
			e=13;
			break;
		case "E":
			e=14;
			break;
		case "F":
			e=15;
			break;
		case "G":
			e=16;
			break;
		case "H":
			e=17;
			break;
		case "I":
			e=34;
			break;
		case "J":
			e=18;
			break;
		case "K":
			e=19;
			break;
		case "L":
			e=20;
			break;
		case "M":
			e=21;
			break;
		case "N":
			e=22;
			break;
		case "O":
			e=35;
			break;
		case "P":
			e=23;
			break;
		case "Q":
			e=24;
			break;
		case "R":
			e=25;
			break;
		case "S":
			e=26;
			break;
		case "T":
			e=27;
			break;
		case "U":
			e=28;
			break;
		case "V":
			e=29;
			break;
		case "W":
			e=32;
			break;
		case "X":
			e=30;
			break;
		case "Y":
			e=31;
			break;
		case "Z":
			e=33;
			break;
		default:
		//	System.out.println("error");
	}
	//	System.out.println(e);//----------------------------------
		return e;
	}

}
