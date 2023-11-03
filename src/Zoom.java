import java.util.*;
import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Zoom {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        AtomicInteger mew = new AtomicInteger(0);

        System.out.println(Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).filter(x -> mew.addAndGet(1) % data[1] == 0).mapToObj(Integer::toString).collect(Collectors.joining(" ")));
    }
}
