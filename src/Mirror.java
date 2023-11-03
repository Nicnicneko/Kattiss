import java.util.*;
import java.io.*;

public class Mirror {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        for (int j = 0; j < mew; j++) {
            char[][] stuff = new char[nya.nextInt()][nya.nextInt()];
            nya.nextLine();

            for (int i = 0; i < stuff.length; i++) {
                stuff[i] = nya.nextLine().toCharArray();
            }

            stuff = rot(rot(stuff));

            System.out.printf("Test %d\n", j+1);
            for (char[] x : stuff)
                System.out.println(x);
        }


    }

    private static char[][] rot(char[][] mat){
        char[][] temp = new char[mat[0].length][mat.length];

        for (int i = 0; i < temp.length; i++)
            for (int j = 0; j < temp[i].length; j++)
                temp[i][j] = mat[mat.length-1-j][i];

        return temp;
    }
}
