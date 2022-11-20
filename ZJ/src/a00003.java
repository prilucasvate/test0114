import java.util.Collections;
import java.util.Scanner;

public class a00003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();
        int aa=a*d;
        int bb=b*d;
        int cc=c*b;
        int dd=d*b;
        int ttu=aa+cc;
        int ttd=bb;
        int ans1=ttu/ttd;
        int ans2=0;
        int ans3=1;
        int tmp=ttu-(ans1*bb);
        int n1 = tmp, n2 = bb, gcd = 1;
        for(int i = 1; i <= n1 && i <= n2; ++i) {
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        ans2=tmp/gcd;
        ans3=bb/gcd;
        System.out.println(ans1+"+"+ans2+"/"+ans3);
//------------------------------   :(
    }
}
