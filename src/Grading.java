import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class Grading {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        IntStream mew = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt);
        int mow = Integer.parseInt(nya.readLine());
        System.out.println("ABCDEF".charAt((int)mew.filter(x -> x > mow).count()));
    }
}
