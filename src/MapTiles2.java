import java.util.*;
import java.io.*;

public class MapTiles2 {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int x = 0, y = 0;

        String bleh = nya.nextLine();

        for (int i = 0; i < bleh.length(); i++) {
            int temp = bleh.charAt(i) - 48;
//            System.out.println(temp);
            if(temp == 1 || temp == 3)
                x += Math.pow(2, bleh.length() - i - 1);
            if(temp == 2 || temp == 3)
                y += Math.pow(2, bleh.length() - i - 1);
        }

        System.out.printf("%d %d %d", bleh.length(), x, y);
    }
}
