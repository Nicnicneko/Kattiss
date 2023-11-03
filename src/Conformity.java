import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Conformity {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, Integer> mew = new TreeMap<>();

        for (int i = Integer.parseInt(nya.readLine()); i > 0; i--) {
            String temp = Arrays.stream(nya.readLine().split(" ")).sorted().collect(Collectors.joining());
            mew.computeIfPresent(temp, (k, v)-> v+1);
            mew.putIfAbsent(temp, 1);
        }
        int max = mew.values().stream().mapToInt(Integer::intValue).max().orElse(-1);
        System.out.println(mew.values().stream().mapToInt(Integer::intValue).filter(x -> x == max).sum());
    }
}
