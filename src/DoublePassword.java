import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class DoublePassword {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        char[] mew = nya.readLine().toCharArray(), maw = nya.readLine().toCharArray();
        int pos = 0;
        for(int i = 0; i < mew.length; i++){
            pos += mew[i] == maw[i] ? 0 : 1;
        }
        System.out.println(new int[]{1, 2, 4, 8, 16}[pos]);
    }
}
