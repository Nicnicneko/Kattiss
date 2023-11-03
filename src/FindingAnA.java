import java.util.*;
import java.io.*;

public class FindingAnA {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(nya.nextLine().replaceFirst(".*?(?=a)", ""));
    }
}
