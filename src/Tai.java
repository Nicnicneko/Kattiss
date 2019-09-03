import java.util.*;
import java.io.*;

public class Tai {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cases = Integer.parseInt(nya.nextLine());

        double[] times = new double[cases];
        times[0] = nya.nextDouble()/1000.;
        double[] vals =  new double[cases];
        vals[0] = nya.nextDouble();
        double sum = 0;

        for (int i = 1; i < cases; i++) {
            times[i] = nya.nextDouble()/1000.;
            vals[i] = nya.nextDouble();
            sum += .5 * (vals[i] + vals[i-1]) * (times[i] - times[i-1]);
        }

        System.out.println(sum);
    }
}
