import java.util.*;
import java.io.*;

public class Mancala {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        for (int i = 1; i <= mew; i++) {
            int meow = nya.nextInt(), sto = nya.nextInt();
            int[] ans = new int[80];
            for (int j = 0; j < sto; j++) {
                int k = 0;
                for (; ans[k] != 0; k++) {
                    ans[k]--;
                }
                ans[k] = k + 1;
            }
            System.out.printf("%d %d\n%s\n", meow, Arrays.stream(ans).max().getAsInt(), Arrays.toString(ans).replaceAll("[\\[\\],]", "").replaceAll("( 0)+$", ""));
        }
    }
}
