import java.util.*;
import java.io.*;

public class pieceOfCake2 {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int a = nya.nextInt();
        int b = nya.nextInt();
        int c = nya.nextInt();

        System.out.println(4*Math.max(b,a-b)*Math.max(c,a-c));
    }
}
