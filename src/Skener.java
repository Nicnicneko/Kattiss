import java.util.*;
import java.io.*;

public class Skener {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        char[][] cat = new char[nya.nextInt()][nya.nextInt()];
        int r = nya.nextInt();
        int c = nya.nextInt();
        nya.nextLine();

        for (int i = 0; i < cat.length; i++) {
            cat[i] = nya.nextLine().toCharArray();
        }

        char[][] temp = new char[cat.length * r][cat[0].length];

        for (int i = 0; i < cat.length; i++) {
            for (int j = 0; j < r; j++) {
                temp[i*r + j] = cat[i];
            }
        }

        char[][] meow = new char[cat.length*r][cat[0].length*c];

        for (int i = 0; i < cat[0].length; i++) {
            for (int j = 0; j < meow.length; j++) {
                for (int k = 0; k < c; k++) {
                    meow[j][i*c+k] = temp[j][i];
                }
            }
        }

        for(char[] x:meow) {
            for (char y : x)
                System.out.print(y);
            System.out.println();
        }

    }
}
