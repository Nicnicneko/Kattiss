import java.util.*;
import java.io.*;

public class HumanCannonball2 {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int times = Integer.parseInt(nya.nextLine());

        while(times-->0){
            double[] a = Arrays.stream(nya.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double t = a[2]/a[0]/Math.cos(Math.toRadians(a[1]));
            double y = a[0] * t * Math.sin(Math.toRadians(a[1])) - .5 * 9.81 * Math.pow(t,2);
            System.out.println(y - a[3] >= 1 && a[4] - y >= 1?"Safe":"Not Safe");
        }
    }
}
