import java.util.*;
import java.io.*;

public class QuickEstimate {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();
        for (int i = 0; i < cats; i++) {
            System.out.println(nya.next().length());
        }
    }
}
