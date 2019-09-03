import java.util.*;
import java.io.*;

public class Oddities {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int a = nya.nextInt();
        while (a-- > 0) {
            int b = nya.nextInt();
            System.out.printf(b % 2 == 0?"%d is even\n":"%d is odd\n",b);
        }
    }
}
