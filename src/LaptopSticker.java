import java.util.*;
import java.io.*;

public class LaptopSticker {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(data[0] - data[2] > 1 && data[1] - data[3] > 1 ? 1 : 0);
    }
}
