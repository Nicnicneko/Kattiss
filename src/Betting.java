import java.util.*;
import java.io.*;

public class Betting {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int meow = nya.nextInt();
        System.out.printf("%f\n%f", 100.0/meow, 100.0/(100-meow));
    }
}
