import java.util.*;
import java.io.*;

public class Rijeci {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();
        int a = 1;
        int b = 0;
        for (int i = 0; i < cats; i++) {
            int a_ = b;
            int b_ = b + a;
            a = a_;
            b = b_;
        }
        System.out.printf("%d %d\n",a,b);
    }
}
