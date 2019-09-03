import java.util.*;
import java.io.*;

public class Pet {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int[] scores = new int[5];
        int max = -1;
        int nyan = -1;
        for (int i = 0; i < 5; i++) {
            scores[i] = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).sum();
            if(scores[i] >= max) {
                max = scores[i];
                nyan = i;
            }
        }
        System.out.printf("%d %d\n",nyan+1,max);

    }
}
