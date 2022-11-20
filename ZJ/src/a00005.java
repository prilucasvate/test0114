import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class a00005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //30714
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int a= scanner.nextInt();
        int aa[][]=new int[a][2];
        int bb[]=new int[a];
        int ct[]=new int[a];
        int cc[]=new int[a];
        for (int i = 0; i <a ; i++) {
            bb[i]= scanner.nextInt();
            cc[i]= scanner.nextInt();
            ct[i]=cc[i];
            hm.put(cc[i],bb[i]);
        }
        Arrays.sort(ct);
        int tt[]=new int[a];int aq=0;
        for (int i = ct.length-1; i>=0 ; i--) {
            int tp1=hm.get(ct[i]);
            int tp2=ct[i];
            aq=aq+tp1;
            tt[i]=aq+tp2;
        }
        Arrays.sort(tt);
        System.out.println(tt[tt.length-1]);
//------------------------   :(   :(  :(
    }
}
