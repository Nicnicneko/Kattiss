import java.util.*;
import java.io.*;

public class NastyHacks {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int times = nya.nextInt();
        for (int i = 0; i < times; i++) {

            int a = nya.nextInt();
            int b = nya.nextInt();
            int c = nya.nextInt();

            if (a > b - c)
                System.out.println("do not advertise");
            else if (a < b - c)
                System.out.println("advertise");
            else
                System.out.println("does not matter");
        }
    }
}
