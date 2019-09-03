import java.util.*;
import java.io.*;

public class ShatteredCake {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int width = Integer.parseInt(nya.nextLine());
        int pieces = Integer.parseInt(nya.nextLine());

        long total = 0;

        while(pieces-->0) {
            String[] doop = nya.nextLine().split(" ");
            total += Integer.parseInt(doop[0]) * Integer.parseInt(doop[1]);
        }

        System.out.printf("%.0f",(double)total/(double)width);


    }
}
