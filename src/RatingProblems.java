import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RatingProblems {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        IntStream mew = IntStream.generate(() -> -3);
        IntStream mow = IntStream.generate(() -> 3);
        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(;data[1]-->0;) {
            int temp = Integer.parseInt(nya.readLine());
            mew = IntStream.concat(IntStream.of(temp), mew);
            mow = IntStream.concat(IntStream.of(temp), mow);
        }

        System.out.printf("%.4f %.4f\n", mew.limit(data[0]).average().getAsDouble(), mow.limit(data[0]).average().getAsDouble());
    }
}
