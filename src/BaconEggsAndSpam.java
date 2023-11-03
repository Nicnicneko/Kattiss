import java.util.*;
import java.io.*;

public class BaconEggsAndSpam {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        while(nya.hasNext()){
            int mew = Integer.parseInt(nya.nextLine());
            if(mew == 0)
                return;

            TreeMap<String, TreeSet<String>> stuff = new TreeMap<>();

            for (int i = 0; i < mew; i++) {
                String[] data = nya.nextLine().split(" ");

                for (int j = 1; j < data.length; j++) {
                    if(!stuff.containsKey(data[j]))
                        stuff.put(data[j], new TreeSet<>());

                    stuff.get(data[j]).add(data[0]);
                }
            }

            for(String x: stuff.keySet())
                System.out.printf("%s %s\n", x, stuff.get(x).toString().replaceAll("[\\[\\],]", ""));
            System.out.println();
        }
    }
}
