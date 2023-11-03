import java.util.*;
import java.io.*;

public class Peragrams {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int[] boop = new int[26];

        String mew = nya.nextLine();

        for(char x: mew.toCharArray()){
            boop[x-97]++;
        }

        System.out.println(Math.max(0, Arrays.stream(boop).map(x -> x % 2 == 0 ? 0 : 1).sum() - 1));
    }
}
