import java.util.*;
import java.io.*;

public class Trik {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String cat = nya.nextLine();
        String pos = "100";
        for (int i = 0; i < cat.length(); i++) {
            pos = tricky(pos,cat.charAt(i));
        }

        switch(pos){
            case "100": System.out.println(1);break;
            case "010": System.out.println(2);break;
            case "001": System.out.println(3);break;
        }
    }
    public static String tricky(String b,char m){
        switch(m){
            case 'A': b = "" + b.charAt(1) + b.charAt(0) + b.charAt(2);break;
            case 'B': b = "" + b.charAt(0) + b.charAt(2) + b.charAt(1) + "";break;
            case 'C': b = "" + b.charAt(2) + b.charAt(1) + b.charAt(0) + "";break;
        }
        return b;
    }
}
