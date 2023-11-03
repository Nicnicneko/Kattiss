import java.util.*;
import java.io.*;

public class Kafkaesque {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int mew = nya.nextInt(), cur = nya.nextInt(), ans = 0;

        for(int i = 1; i < mew; i++){
            int temp = nya.nextInt();
            ans += temp < cur ? 1 : 0;
            cur = temp;
        }
        System.out.println(ans + 1);
    }
}
