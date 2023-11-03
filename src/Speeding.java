import java.util.*;
import java.io.*;

public class Speeding {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int mews = Integer.parseInt(nya.readLine()) - 1;
        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ans = 0;
        for (; mews-- > 0; ) {
            int[] temp = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            ans = Math.max(ans, (temp[1] - data[1]) / (temp[0] - data[0]));
            data = temp;
        }
        System.out.println(ans);
    }
}
