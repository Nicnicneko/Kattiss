import java.util.*;
import java.io.*;

public class ForcedChoice {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while(data[2]-->0){
            System.out.println(Arrays.stream(nya.readLine().split(" ")).skip(1).parallel().mapToInt(Integer::parseInt).anyMatch(x -> x == data[1]) ? "KEEP": "REMOVE");
        }
    }
}
