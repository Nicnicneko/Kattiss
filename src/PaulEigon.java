import java.util.*;
import java.io.*;

public class PaulEigon {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] data  = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((data[1] + data[2]) / data[0] % 2 == 0 ? "paul" : "opponent");
    }
}
