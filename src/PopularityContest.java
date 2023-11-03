import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class PopularityContest {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] ans = IntStream.range(1, data[0] + 1).map(x->-x).toArray();

        nya.lines().distinct().forEach(x->{
            int[] temp = Arrays.stream(x.split(" ")).mapToInt(Integer::parseInt).toArray();
            ans[temp[0]-1]++;
            ans[temp[1]-1]++;
        });
        System.out.println(Arrays.toString(ans).replaceAll("[\\[\\],]", ""));
    }


}
