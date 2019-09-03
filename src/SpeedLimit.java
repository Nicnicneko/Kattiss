import java.util.*;
import java.io.*;

public class SpeedLimit {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        while(true) {
            int cats = nya.nextInt();
            if(cats == -1) break;
            int mph = nya.nextInt();
            int tim = nya.nextInt();
            int sum = mph*tim;

            for (int i = 1; i < cats; i++) {
                mph = nya.nextInt();
                int ti = nya.nextInt();
                sum += mph * (ti - tim);
                tim = ti;
            }
            System.out.printf("%d miles\n",sum);
        }

    }
}
