import java.util.*;
import java.io.*;

public class DRM {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String cat = nya.nextLine();
        String meow = rotate(cat.substring(0,cat.length()/2));
        String mew = rotate(cat.substring(cat.length()/2));
        System.out.println(merge(meow,mew));

    }

    private static String rotate(String x) {
        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            sum += x.charAt(i) - 65;
        }
        //System.out.println(sum);
        String meow = "";
        for (int i = 0; i < x.length(); i++) {
            char temp = (char)((x.charAt(i) + sum % 26) % 91);
            meow += temp < 65 ? (char)(temp + 65) : temp;
        }

        return meow;
    }

    private static String merge(String meow, String mew) {
        String catto = "";
        for (int i = 0; i < meow.length(); i++) {
            char temp = (char)((meow.charAt(i) + mew.charAt(i) - 65) % 91);
            catto += temp < 65 ? (char)(temp + 65) : temp;
        }
        return catto;
    }
}
