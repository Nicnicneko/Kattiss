import java.util.*;
import java.io.*;

public class TornByGGE {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        nya.readLine();
        int[] mew = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int temp = 1000000;
        int ans = 1;
        for(int x: mew) {
            if(x > temp)
                ans++;
            temp = x;
        }
        System.out.println(ans);
    }
}
