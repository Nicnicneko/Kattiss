import java.util.*;
import java.io.*;

public class SevenWonders {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String a = nya.nextLine();
        int t = a.replaceAll("[^T]","").length();
        int c = a.replaceAll("[^C]","").length();
        int g = a.replaceAll("[^G]","").length();
        System.out.println((int)(Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2) + 7 * Math.min(Math.min(t,c),g)));
    }
}
