import java.util.*;
import java.io.*;

public class HeirsDilemma {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int a = nya.nextInt(), b = nya.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = a; i < b; i++) {
            HashSet<Character> temp = new HashSet<>();
            for(char x: Integer.toString(i).toCharArray())
                temp.add(x);

            if(temp.size() < 6 || temp.contains('0'))
                continue;

            boolean skip = false;

            for(char x: temp) {
                if (i % (x-48) != 0)
                    skip = true;
            }

            if(skip)
                continue;

            ans.add(i);
        }

        System.out.println(ans.size());
    }
}
