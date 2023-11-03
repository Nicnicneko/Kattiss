import java.util.*;
import java.io.*;

public class Sok {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        double[] data = Arrays.stream(nya.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double[] rat = Arrays.stream(nya.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

//        int gcd = gcd(gcd(rat[0], rat[1]), rat[2]);

        double mul = Math.min(Math.min(data[0]/rat[0], data[1]/rat[1]),data[2]/rat[2]);

        System.out.printf("%f %f %f", data[0] - mul * rat[0], data[1] - mul * rat[1], data[2] - mul * rat[2]);
    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
