import java.util.*;
import java.io.*;

public class Statistics {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        for (int i = 1; nya.hasNext(); i++) {
            String[] data = nya.nextLine().split(" ");
            int max = Arrays.stream(Arrays.copyOfRange(data, 1, data.length)).mapToInt(Integer::parseInt).max().getAsInt();
            int min = Arrays.stream(Arrays.copyOfRange(data, 1, data.length)).mapToInt(Integer::parseInt).min().getAsInt();
            System.out.printf("Case %d: %d %d %d\n", i, min, max, max - min);
        }
    }
}
