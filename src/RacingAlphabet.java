import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class RacingAlphabet {

    static HashMap<Character, Integer> let = new HashMap();

    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        char[] temp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '".toCharArray();

        for (int i = 0; i < temp.length; i++)
            let.put(temp[i], i);

        int times = Integer.parseInt(nya.nextLine());

        while(times-->0){
            String x = nya.nextLine();

            double ans = 0;

            for (int i = 0; i < x.length()-1; i++)
                ans += dist(x.charAt(i), x.charAt(i+1));

            ans *= 2 * Math.PI * 30 / 28;

            System.out.printf("%.6f\n", ans/15 + x.length());
        }
    }

    private static int dist(char a, char b){
        return Math.min( Math.abs(let.get(a) - let.get(b)), Math.min(let.size() - let.get(a), let.size() - let.get(b)) + Math.min(let.get(a), let.get(b)) );
    }
}
