import java.util.*;
import java.io.*;

public class Hangman {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        HashSet<Character> mew = new HashSet<>();
        for(char x : nya.nextLine().toCharArray())
            mew.add(x);
        String meow = nya.nextLine();
        int bad = 0;
        int cur = 0;
        for (int i = 0; i < meow.length(); i++) {
            if(mew.contains(meow.charAt(i)))
                mew.remove(meow.charAt(i));
            else
                bad++;
            if(bad == 10)
                break;
            else if(mew.isEmpty()) {
                System.out.println("WIN");
                break;
            }
        }
        if(bad == 10)
            System.out.println("LOSE");
    }
}
