import java.util.*;
import java.io.*;

public class CostumeContest {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int peeps = Integer.parseInt(nya.nextLine());

        TreeMap<String, Integer> costume = new TreeMap();

        for (int i = 0; i < peeps; i++) {
            String temp = nya.nextLine();
            if(!costume.containsKey(temp))
                costume.put(temp, 1);
            else
                costume.put(temp, costume.get(temp) + 1);
        }

        int min = Integer.MAX_VALUE;

        for(int x: costume.values())
            min = Math.min(min,x);

        for(String x: costume.keySet())
            if(costume.get(x) == min)
                System.out.println(x);
    }
}
