import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class CPRNummer {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] mew = Arrays.stream(nya.readLine().replace("-","").split("-*")).parallel().mapToInt(Integer::parseInt).toArray();
        int[] mow = {4, 3, 2, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(IntStream.range(0,10).parallel().map(i -> mow[i] * mew[i]).sum() % 11 == 0 ? 1 : 0);
    }
}
