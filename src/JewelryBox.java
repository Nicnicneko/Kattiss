import java.util.*;
import java.io.*;

public class JewelryBox {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int times = Integer.parseInt(nya.nextLine());

        while(times-->0){
            System.out.println(solve(nya.nextInt(), nya.nextInt()));
        }
    }

    private static double solve(double x, double y){
        double[] temp = { (4 * (x + y) + Math.sqrt(16 * Math.pow(x + y, 2) - 48*x*y)) / 24.0, (4 * (x + y) - Math.sqrt(16 * Math.pow(x + y, 2) - 48*x*y)) / 24.0 };

        return Math.max((x - 2*temp[0])*(y - 2*temp[0])*temp[0], (x - 2*temp[1])*(y - 2*temp[1])*temp[1]);
    }
}
