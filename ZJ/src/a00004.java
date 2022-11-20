import java.util.HashMap;
import java.util.Scanner;

public class a00004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //30714
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        HashMap<Integer, String> mh = new HashMap<Integer, String>();
        String a = scanner.next();
        String as[] = a.split("");
        int aa = 0;
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);

        String sss[] = {"I", "V", "X", "L", "C", "D", "M"};
        //-------------------------A
        if(as.length>1){
            for (int i = 0; i < as.length - 1; i++) {
                if (hm.get(as[i]) >= hm.get(as[i + 1])) {
                    aa = aa + hm.get(as[i]);
                    if (i == as.length - 2) {
                        aa = aa + hm.get(as[as.length - 1]);
                    }
                } else {
                    aa = aa + hm.get(as[i + 1]) - hm.get(as[i]);
                    i++;
                }
            }
        }else{
        aa=aa+hm.get(as[0]);
        }

        System.out.println(aa);
//-------------------------------------    :)
    }
}
