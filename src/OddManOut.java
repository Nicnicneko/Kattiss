import java.util.*;
import java.io.*;

public class OddManOut {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();
        for (int i = 0; i < cats; i++) {
            int cat = nya.nextInt();
            HashSet<Integer> meow = new HashSet();
            for (int j = 0; j < cat; j++) {
                int mew = nya.nextInt();
                if(!meow.contains(mew))
                    meow.add(mew);
                else
                    meow.remove(mew);
            }
            for(int x: meow)
                System.out.printf("Case #%d: %d\n",i+1,x);
        }
    }
}
