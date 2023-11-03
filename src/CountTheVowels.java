import java.util.*;
import java.io.*;

public class CountTheVowels {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(nya.nextLine().toLowerCase().replaceAll("[^aeiou]", "").length());
    }
}
