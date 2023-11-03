import java.util.*;
import java.io.*;

public class TripleTexting {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        String text = nya.nextLine();

        String ans = "";

        for (int i = 0; i < text.length()/3; i++) {
            char[] temp = {text.charAt(i) , text.charAt(i + text.length()/3) , text.charAt(i + 2*text.length()/3)};
            Arrays.sort(temp);
            ans += temp[1];
        }

        System.out.println(ans);
    }
}
