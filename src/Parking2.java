import java.util.*;
import java.io.*;

public class Parking2 {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = Integer.parseInt(nya.nextLine());
        for (int i = 0; i < cats; i++) {
            nya.nextLine();
            double[] meow = Arrays.stream(nya.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double test_dist = 50;
            double accuracy = .1;
            double minx = 50;
            double minval = Arrays.stream(meow).map(n -> Math.abs(50-n)).sum();

            while(test_dist > accuracy){
                double tval1 = minx + test_dist;
                double tval2 = minx - test_dist;
                double temp1 = Arrays.stream(meow).map(n -> Math.abs(tval1-n)).sum();
                double temp2 = Arrays.stream(meow).map(n -> Math.abs(tval2-n)).sum();

                if(temp1 < minval){
                    minval = temp1;
                    minx += test_dist;
                }else if(temp2 < minval){
                    minval = temp2;
                    minx -= test_dist;
                }else
                    test_dist /= 1.5;
            }
            System.out.println(minx);
        }

    }
}
