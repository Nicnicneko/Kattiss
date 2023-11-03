import java.util.*;
import java.io.*;

public class SecretMessage {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        while(mew-->0){
            String mes = nya.nextLine();
            int size = (int)Math.ceil(Math.sqrt(mes.length()));

            char[][] mat = new char[size][size];

            for (int i = 0; i < size; i++)
                for (int j = 0; j < size; j++)
                    mat[i][j] = i*size + j < mes.length() ? mes.charAt(i*size + j) : '*';

            mat = rot(mat);

            String ans = "";

            for(char[] x: mat)
                ans += new String(x);

            System.out.println(ans.replaceAll("\\*", ""));
        }
    }

    private static char[][] rot(char[][] mat){
        char[][] temp = new char[mat.length][mat.length];

        for (int i = 0; i < temp.length; i++)
            for (int j = 0; j < temp.length; j++)
                temp[i][j] = mat[mat.length-1-j][i];

        return temp;
    }
}
