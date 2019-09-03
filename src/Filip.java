import java.util.*;
import java.io.*;

public class Filip {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String a = nya.next();
        String b = nya.next();

        for (int i = a.length()-1; i >= 0; i--) {
            if(a.charAt(i) > b.charAt(i)) {
                System.out.println(flip(a));
                break;
            }
            else if(a.charAt(i) < b.charAt(i)) {
                System.out.println(flip(b));
                break;
            }
        }
    }

    public static String flip(String x){
        String change = "";
        for (int i = x.length()-1; i >= 0; i--) {
            change += x.charAt(i);
        }
        return change;
    }
}
