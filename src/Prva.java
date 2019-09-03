import java.util.*;
import java.io.*;

public class Prva {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int a = nya.nextInt(), b = nya.nextInt();
        nya.nextLine();
        char[][] meow = new char[a][b];
        for (int i = 0; i < a; i++)
            meow[i] = nya.nextLine().toCharArray();

        TreeSet<String> dyl = new TreeSet();

        for(char[] x: meow)
            dyl.addAll(Arrays.asList(new String(x).split("#")));
        for(char[] x: rotate(meow))
            dyl.addAll(Arrays.asList(new String(x).split("#")));
        dyl.removeIf(n -> n.length() < 2);

        for(String x: dyl) {
            System.out.println(x);
            break;
        }
    }

    private static char[][] rotate(char[][] jumble){
        char[][] temp = new char[jumble[0].length][jumble.length];

        for (int i = 0; i < temp.length; i++)
            for (int j = 0; j < temp[i].length; j++)
                temp[i][j] = jumble[j][i];

        return temp;
    }
}
