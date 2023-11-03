import java.util.*;
import java.io.*;

public class DrunkVigenere {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        String c = nya.nextLine(), k = nya.nextLine();

        for (int i = 0; i < c.length(); i++) {
            int temp = i % 2 == 0 ? c.charAt(i) - (k.charAt(i) - 65) : c.charAt(i) + (k.charAt(i) - 65);
            System.out.print(temp < 65 ? (char)(temp + 26) : temp > 90 ? (char)(temp - 26) : (char)(temp));
        }
    }
}
