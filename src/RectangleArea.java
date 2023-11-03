import java.util.*;
import java.io.*;

public class RectangleArea {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        double[] data = Arrays.stream(nya.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        System.out.printf("%.3f", Math.abs(data[0] - data[2]) * Math.abs(data[1] - data[3]));
    }
}
