import java.util.*;
import java.io.*;

public class SumOfTheOthers {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        while(nya.hasNext()) {
            int[] nums = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int total = Arrays.stream(nums).sum();
            for (int x : nums) {
                if (total - x == x) {
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
