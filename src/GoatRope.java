import java.util.*;
import java.io.*;

public class GoatRope {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int[] data = {nya.nextInt(), nya.nextInt(), nya.nextInt(), nya.nextInt(), nya.nextInt(), nya.nextInt()};

        System.out.println(Math.hypot( data[0] < data[2] ? data[2] - data[0] : data[0] > data[4] ? data[0] - data[4] : 0, data[1] < data[3] ? data[3] - data[1] : data[1] > data[5] ? data[1] - data[5] : 0 ));
    }
}
