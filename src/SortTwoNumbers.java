import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class SortTwoNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().mapToObj(Integer::toString).collect(Collectors.joining(" ")));
    }
}
