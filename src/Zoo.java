import java.util.*;
import java.io.*;

public class Zoo {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        for(int i = 1 ;; i++){
            int mew = Integer.parseInt(nya.nextLine());
            if(mew == 0)
                return;
            TreeMap<String, Integer> ani = new TreeMap<>();

            for (int j = 0; j < mew; j++) {
                String[] temp = nya.nextLine().toLowerCase().split(" ");
                if(!ani.containsKey(temp[temp.length-1]))
                    ani.put(temp[temp.length-1], 1);
                else
                    ani.put(temp[temp.length-1], ani.get(temp[temp.length-1]) + 1);
            }

            System.out.printf("List %d:\n", i);
            for(String x : ani.keySet())
                System.out.printf("%s | %d\n", x, ani.get(x));
        }
    }
}
