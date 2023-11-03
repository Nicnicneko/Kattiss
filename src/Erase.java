import java.util.*;
import java.io.*;

public class Erase {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        boolean erase = Integer.parseInt(nya.nextLine()) % 2 == 0, ans = true;
        String a = nya.nextLine(), b = nya.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if(erase != (a.charAt(i) == b.charAt(i))){
                ans = false;
                break;
            }
        }

        System.out.println(ans ? "Deletion succeeded" : "Deletion failed");
    }
}
