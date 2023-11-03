import java.util.*;
import java.io.*;

public class Hailstone2 {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        long mew = Long.parseLong(nya.readLine()), ans = 1;

        for(;mew != 1; mew = mew % 2 == 0 ? mew/2 : 3*mew + 1, ans++);

        System.out.println(ans);
    }
}
