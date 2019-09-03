import java.util.*;
import java.io.*;

public class Zanzibar {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int cats = Integer.parseInt(nya.nextLine());

        for (int i = 0; i < cats; i++) {
            int[] meow = Arrays.stream(nya.nextLine().replace(" 0","").split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            for (int j = 1; j < meow.length; j++) {
                sum += meow[j] - meow[j-1]*2 > 0 ? (meow[j] - meow[j-1]*2) : 0;
            }
            System.out.println(sum);
        }
    }
}
