import java.util.*;
import java.io.*;

public class Quadrant {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int x = nya.nextInt();
        int y = nya.nextInt();

        if(x > 0)
            if(y > 0)
                System.out.println(1);
            else
                System.out.println(4);
        else
            if(y > 0)
                System.out.println(2);
            else
                System.out.println(3);
    }
}
