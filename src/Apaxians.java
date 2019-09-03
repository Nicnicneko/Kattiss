import java.util.*;
import java.io.*;

public class Apaxians {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(nya.nextLine().replaceAll("(?<=(\\w))\\1+",""));
    }
}
