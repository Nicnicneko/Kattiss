import java.util.*;
import java.io.*;

public class DifferentDistances {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        while(nya.hasNext()){
            String data = nya.nextLine();
            if(data.equals("0"))
                return;
            double[] stuff = Arrays.stream(data.split(" ")).mapToDouble(Double::parseDouble).toArray();

            System.out.println(Math.pow(Math.pow(Math.abs(stuff[2] - stuff[0]), stuff[4]) + Math.pow(Math.abs(stuff[3] - stuff[1]), stuff[4]), 1 / stuff[4]));
        }
    }
}
