import java.util.*;
import java.io.*;

import static java.util.stream.Collectors.*;

public class AboveAverage {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int cases = Integer.parseInt(nya.nextLine());

        while(cases-->0) {
            int people = nya.nextInt();
            double[] scores = Arrays.stream(nya.nextLine().trim().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double average = Arrays.stream(scores).average().getAsDouble();

            double count = 0;

            for(double x: scores){
                if(x > average)
                    count++;
            }

            System.out.printf("%.3f%%\n",count/people*100);
        }


    }
}
