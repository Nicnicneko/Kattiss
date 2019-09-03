import java.util.*;
import java.io.*;

public class Soylent {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();
        while(cats-->0){
            System.out.println((int)Math.ceil(nya.nextDouble()/400.0));
        }
    }
}
