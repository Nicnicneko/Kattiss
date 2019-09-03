import java.util.*;
import java.io.*;

public class Everywhere {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cases = nya.nextInt();

        while(cases-->0){
            int stuffs = nya.nextInt();
            nya.nextLine();
            HashSet<String> cat = new HashSet<>();
            while(stuffs-->0){
                cat.add(nya.nextLine());
            }
            System.out.println(cat.size());
        }
    }
}
