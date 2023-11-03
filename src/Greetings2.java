import java.util.*;
import java.io.*;

public class Greetings2 {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.printf("h%sy\n", "e".repeat((nya.nextLine().length() - 2)*2));
    }
}
