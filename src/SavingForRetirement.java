import java.util.*;
import java.io.*;

public class SavingForRetirement {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int[] stuff = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println((int)(stuff[3] + Math.ceil((stuff[1] - stuff[0] + .000001) * stuff[2] / (double)stuff[4])));
    }
}
