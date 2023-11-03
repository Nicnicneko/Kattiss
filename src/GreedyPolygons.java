import java.util.*;
import java.io.*;

public class GreedyPolygons {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        while(mew-->0){
            double[] data = {nya.nextInt(), nya.nextInt(), nya.nextInt(), nya.nextInt()};
            System.out.println(.5 * data[0] * data[1] * data[1] / 2 / Math.tan(Math.toRadians(180/data[0]))+data[0]*data[1]*data[2]*data[3]+Math.PI*Math.pow(data[2]*data[3],2));
        }
    }
}
