import java.util.*;
import java.io.*;

public class FallingApart {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        ArrayList<Integer> stuff = new ArrayList<>();

        for (int i = 0; i < mew; i++) {
            stuff.add(nya.nextInt());
        }

        Collections.sort(stuff, Collections.reverseOrder());

        int a = 0, b = 0;

        boolean boop = false;

        while(!stuff.isEmpty()){
            if(boop = !boop)
                a += stuff.remove(0);
            else
                b += stuff.remove(0);
        }

        System.out.printf("%d %d", a, b);
    }
}
