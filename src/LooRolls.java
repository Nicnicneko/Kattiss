import java.util.*;
import java.io.*;

public class LooRolls {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        long[] data = Arrays.stream(nya.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long rolls = 1;

        while(data[0] % data[1] != 0) {
            data[1] = data[1] - data[0] % data[1];
            rolls++;
        }

        System.out.println(rolls);
    }
}
