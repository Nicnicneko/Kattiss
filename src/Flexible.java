import java.util.*;
import java.io.*;

public class Flexible {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        
        ArrayList<Integer> div = new ArrayList<>();
        div.add(0);
        div.add(nya.nextInt());
        
        int mew = nya.nextInt();

        for (int i = 0; i < mew; i++) {
            div.add(nya.nextInt());
        }
        
        TreeSet<Integer> ans = new TreeSet<>();

        for (int i = 0; i < div.size(); i++) {
            for (int j = i+1; j < div.size(); j++) {
                ans.add(Math.abs(div.get(i) - div.get(j)));
            }
        }

        System.out.println(ans.toString().replaceAll("[\\[\\],]", ""));
    }
}
