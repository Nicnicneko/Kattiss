import java.util.*;
import java.io.*;

public class PokerHand {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        TreeMap<Character,Integer> cat = new TreeMap();

        for (int i = 0; i < 5; i++) {
            char temp = nya.next().charAt(0);
            if(!cat.containsKey(temp))
                cat.put(temp, 1);
            else
                cat.put(temp,cat.get(temp)+1);
        }

        int max = -1;

        for(int x:cat.values())
            max = Math.max(max,x);

        System.out.println(max);
    }
}
