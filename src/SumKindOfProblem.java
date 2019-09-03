import java.util.*;
import java.io.*;

public class SumKindOfProblem {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();
        for (int i = 0; i < cats; i++) {
            int mew = nya.nextInt();
            int meow = nya.nextInt();
            System.out.printf("%d %d %d %d\n", mew, meow * (meow + 1) / 2, 2*(meow * (meow + 1) / 2)-meow, 2*(meow * (meow + 1) / 2));
        }
    }
}
