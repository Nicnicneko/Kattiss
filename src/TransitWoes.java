import java.util.*;
import java.io.*;

public class TransitWoes {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int time = nya.nextInt(), end = nya.nextInt(), bus = nya.nextInt();
        int[] walk = new int[bus+1], ride = new int[bus], arrive = new int[bus];

        for (int i = 0; i < walk.length; i++)
            walk[i] = nya.nextInt();
        for (int i = 0; i < ride.length; i++)
            ride[i] = nya.nextInt();
        for (int i = 0; i < arrive.length; i++)
            arrive[i] = nya.nextInt();

        for (int i = 0; i < bus; i++) {
            time += walk[i];
            time += arrive[i] - (time % arrive[i] == 0 ? arrive[i] : time % arrive[i]);
            time += ride[i];
//            System.out.println(time);
        }
//        System.out.println(time + walk[bus]);
        System.out.println(time + walk[bus] > end ? "no" : "yes");
    }
}
