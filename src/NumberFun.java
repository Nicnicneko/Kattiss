import java.util.*;
import java.io.*;

public class NumberFun {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();

        for (int i = 0; i < cats; i++) {
            int a = nya.nextInt();
            int b = nya.nextInt();
            int c = nya.nextInt();
            System.out.println( (a+b == c) || (Math.abs(a-b) == c) || ((double)a/(double)b == (double)c) || ((double)b/(double)a == (double)c) || (a*b == c) ?"Possible":"Impossible");
        }
    }
}
