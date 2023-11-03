import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.io.*;

public class HittingTargets {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<>();

        int mew = Integer.parseInt(nya.nextLine());

        for (int i = 0; i < mew; i++) {
            switch(nya.next()){
                case "rectangle":
                    int[] data = {nya.nextInt(), -nya.nextInt(), nya.nextInt(), -nya.nextInt()};
                    shapes.add(new Rectangle2D.Double(data[0], data[3], data[2] - data[0], data[3] - data[1]));
                    break;
                case "circle":
                    data = new int[] {nya.nextInt(), -nya.nextInt(), nya.nextInt()};
                    shapes.add(new Ellipse2D.Double(data[0] - data[2], data[1] + data[2], data[2], data[2]));
                    break;
            }
        }
        nya.nextLine();

        mew = Integer.parseInt(nya.nextLine());

        for (int i = 0; i < mew; i++) {
            int ans = 0, x = nya.nextInt(), y = -nya.nextInt();
            nya.nextLine();
            for (int j = 0; j < shapes.size(); j++) {
                ans += shapes.get(j).contains(x, y) ? 1 : 0;
            }
            System.out.println(ans);
        }
    }
}
