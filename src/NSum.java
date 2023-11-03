import java.util.*;
import java.io.*;

public class NSum {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        nya.readLine();
        System.out.println(Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).sum());
    }
}
