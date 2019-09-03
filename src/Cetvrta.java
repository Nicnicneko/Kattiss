import java.util.*;
import java.io.*;

public class Cetvrta {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int[] x = new int[2];
        int[] y = new int[2];
        for (int i = 0; i < 2; i++) {
            x[i] = nya.nextInt();
            y[i] = nya.nextInt();
        }

        int _x = nya.nextInt();
        int _y = nya.nextInt();

        if(_x != x[0] && _x != x[1])
            System.out.print(_x);
        else if(_x == x[0])
            System.out.print(x[1]);
        else
            System.out.print(x[0]);

        if(_y != y[0] && _y != y[1])
            System.out.println(" "+_y);
        else if(_y == y[0])
            System.out.println(" "+y[1]);
        else
            System.out.println(" "+y[0]);

    }
}
