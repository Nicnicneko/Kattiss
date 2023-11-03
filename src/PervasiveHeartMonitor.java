import java.util.*;
import java.io.*;

public class PervasiveHeartMonitor {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        while(nya.hasNext()){

            String name = "";
            int i = 0;
            double ans = 0;

            Scanner mew = new Scanner(nya.nextLine());

            while(mew.hasNext()) {
                if (mew.hasNextDouble()) {
                    i++;
                    ans += mew.nextDouble();
                } else
                    name += mew.next() + " ";
            }
            System.out.printf("%f %s\n", ans/i, name.trim());
        }
    }
}
