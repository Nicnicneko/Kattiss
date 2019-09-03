import java.util.*;
import java.io.*;

public class JudgingMoose {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int a = nya.nextInt();
        int b = nya.nextInt();

        if(a == 0 && b == 0)
            System.out.println("Not a moose");
        else {
            if (a == b)
                System.out.print("Even ");
            else
                System.out.print("Odd ");
            System.out.println(Math.max(a,b) * 2);
        }
    }
}
