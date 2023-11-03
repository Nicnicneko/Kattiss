import java.util.*;
import java.io.*;

public class Overdraft {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int mews = Integer.parseInt(nya.readLine());
        int bal = 0, ans = 0;
        for(;mews-->0;) {
            bal += Integer.parseInt(nya.readLine());
            ans = Math.min(ans, bal);
        }
        System.out.println(-ans);
    }
}
