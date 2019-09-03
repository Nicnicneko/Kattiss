import java.util.*;
import java.io.*;

public class Planina {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int it = nya.nextInt();
        int boo = 2;

        for (int i = 0; i < it; i++) {
            boo+= boo-1;
        }

        System.out.println((int)Math.pow(boo,2));
    }
}
