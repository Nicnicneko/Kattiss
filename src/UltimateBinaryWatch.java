import java.util.*;
import java.io.*;

public class UltimateBinaryWatch {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        char[][] ans = new char[4][9];
        for(int c = 0; c < 9; c++){
            String temp = c % 2 == 1 || c == 4 ? "    " : String.format("%4s", Integer.toBinaryString(nya.read() - 48)).replaceAll("0| ", ".").replaceAll("1", "*");
            for(int r = 3; r >= 0; r--) {
                ans[r][c] = temp.charAt(r);
            }
        }
        for(char[] x: ans)
            System.out.println(x);
    }
}
