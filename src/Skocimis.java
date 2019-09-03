import java.util.*;
import java.io.*;

public class Skocimis {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int a = nya.nextInt();
        int b = nya.nextInt();
        int c = nya.nextInt();
        System.out.println( Math.max( Math.abs(a-b) , Math.abs(b-c)) - 1);
    }
}
