import java.util.*;
import java.io.*;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int x = nya.nextInt();
        int y = nya.nextInt();
        int n = nya.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i % x == 0 && i % y == 0)
                System.out.println("FizzBuzz");
            else if(i % x == 0)
                System.out.println("Fizz");
            else if(i % y == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
