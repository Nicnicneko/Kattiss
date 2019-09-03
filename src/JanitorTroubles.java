import java.util.*;
import java.io.*;

public class JanitorTroubles {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int[] meow = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double sp = Arrays.stream(meow).sum()/2.0;
        System.out.println(Math.sqrt((sp - meow[0])*(sp - meow[1])*(sp - meow[2])*(sp - meow[3])));
    }
}
