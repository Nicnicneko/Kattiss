//Dunno wat rong
import java.util.*;
import java.io.*;

public class Kemija {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(nya.nextLine().replaceAll("(?<=([aeiou]))p\\1",""));
    }
}
