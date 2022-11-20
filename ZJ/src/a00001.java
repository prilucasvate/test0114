import java.util.HashMap;
import java.util.Scanner;

public class a00001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //30714
        int a= scanner.nextInt();
        String b=Integer.toBinaryString(a);//-- :)
        System.out.println(b);
        String c=Integer.toHexString(a);// -- :)
        System.out.println(c);
        //---------------   :)
    }
}