import java.util.*;
import java.io.*;

public class GCVWR {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int[] data = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
        System.out.println((int)((data[0] - data[1]) * .9 - sum));
    }
}
