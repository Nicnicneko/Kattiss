import java.util.*;
import java.io.*;

public class Canonical {
    static int[] meowup;
    static int[] coins;
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        nya.nextLine();
        coins = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        meowup = new int[coins[coins.length-1] + coins[coins.length-2]];
        meowup[0] = 0;
        boolean gud = true;
        for (int i = 0; i < meowup.length; i++) {
            //System.out.println(i);
            if(dp(i) != greedy(i)) {
                gud = false;
                break;
            }
        }
        System.out.println(gud?"canonical":"non-canonical");
    }

    private static int dp(int i){
        if(i == 0)
            return 0;
        if(i < 0)
            return 10000000;
        if(meowup[i] > 0)
            return meowup[i];
        else{
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                min = Math.min(min,1 + dp(i-coins[j]));
            }
            meowup[i] = min;
            return min;
        }
    }

    private static int greedy(int i){
        int count = 0;
        while(i > 0){
            for (int j = coins.length-1; j >= 0; j--) {
                if(i - coins[j] >= 0) {
                    i -= coins[j];
                    break;
                }
            }
            count++;
        }
        return count;
    }
}
