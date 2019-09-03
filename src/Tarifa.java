import java.util.*;
import java.io.*;

public class Tarifa {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int mb = nya.nextInt() * (nya.nextInt() + 1);
        int used = 0;
        while(nya.hasNext())
            used += nya.nextInt();
        System.out.println(mb - used);
    }
}
