import java.util.*;
import java.io.*;

public class ScalingRecipe {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        nya.lines().mapToInt(Integer::parseInt).map(x -> x*data[2]/data[1]).forEach(System.out::println);
    }
}
