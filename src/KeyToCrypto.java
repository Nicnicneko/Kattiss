import java.util.*;
import java.io.*;

public class KeyToCrypto {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String c = nya.nextLine(), k = nya.nextLine();

        for(int i = 0; i < c.length(); i++){
            char x = (char)(c.charAt(i) - (k.charAt(i) - 65));
            x = x < 65 ? (char)(x + 26) : x;
            System.out.print(x);
            k += x;
        }
    }
}
