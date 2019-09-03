import java.util.*;
import java.io.*;

public class StarArrangements {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = nya.nextInt();

        System.out.printf("%d:\n",mew);

        for (int i = 2; i < mew; i++) {
            for (int j = i-1; j < i+1; j++) {
                if(i + j <= mew && (mew % (i+j) == 0 || mew % (i+j) == i))
                    System.out.printf("%d,%d\n",i,j);
            }
        }
    }
}
