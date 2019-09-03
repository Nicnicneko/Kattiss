import java.util.*;
import java.io.*;

public class GrassSeed {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        double cost = nya.nextDouble();
        int lawns = nya.nextInt();
        double total = 0;
        for (int i = 0; i < lawns; i++) {
            total += nya.nextDouble() * nya.nextDouble() * cost;
        }
        System.out.printf("%.8f",total);
    }
}
