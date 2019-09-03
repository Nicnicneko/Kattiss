import java.util.*;
import java.io.*;

public class DetailedDifferences {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cases = nya.nextInt();
        for (int i = 0; i < cases; i++) {
            String a = nya.next();
            String b = nya.next();
            System.out.println(a+"\n"+b);
            for (int j = 0; j < a.length(); j++) {
                System.out.print(a.charAt(j) == b.charAt(j)?".":"*");
            }
            System.out.println("\n");
        }
    }
}
