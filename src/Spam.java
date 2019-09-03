import java.util.*;
import java.io.*;

public class Spam {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String cat = nya.nextLine();
        System.out.printf("%.8f\n%.8f\n%.8f\n%.8f\n", cat.replaceAll("[^_]","").length()/(double)cat.length() , cat.replaceAll("[^a-z]","").length()/(double)cat.length() , cat.replaceAll("[^A-Z]","").length()/(double)cat.length() , cat.replaceAll("[_A-Za-z]","").length()/(double)cat.length());
    }
}
