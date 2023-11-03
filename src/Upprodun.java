import java.util.*;
import java.io.*;

public class Upprodun {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] data = {Integer.parseInt(nya.readLine()), Integer.parseInt(nya.readLine())};
        int mew = data[1] % data[0];
        int mow = data[1] / data[0];
        while(data[0]-->0) {
            System.out.println("*".repeat(mow + (mew-- > 0 ? 1 : 0)));
        }
    }
}
