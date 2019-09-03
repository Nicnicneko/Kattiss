import java.util.*;
import java.io.*;

public class Herman {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        double cat = nya.nextInt();
        System.out.printf("%.6f\n%.6f",Math.PI * Math.pow(cat,2),cat * cat * 2);
    }
}
