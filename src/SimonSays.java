import java.util.*;
import java.io.*;

public class SimonSays {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = Integer.parseInt(nya.nextLine());
        for (int i = 0; i < cats; i++) {
            String temp = nya.nextLine();
            if(temp.indexOf("Simon says") == 0)
                System.out.println(temp.replaceAll("Simon says",""));
        }
    }
}
