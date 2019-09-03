import java.util.*;
import java.io.*;

public class Cold {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int total = Integer.parseInt(nya.nextLine());
        System.out.println(nya.nextLine().replaceAll("[^-]","").length());
    }
}
