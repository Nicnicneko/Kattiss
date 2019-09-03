import java.awt.*;
import java.awt.geom.Line2D;
import java.util.*;
import java.io.*;

public class EuropeanTrip {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        Point.Double a = new Point.Double(nya.nextDouble(),nya.nextDouble());
        Point.Double b = new Point.Double(nya.nextDouble(),nya.nextDouble());
        Point.Double c = new Point.Double(nya.nextDouble(),nya.nextDouble());

        double c_ = a.distance(b);
        double a_ = b.distance(c);
        double b_ = c.distance(a);

        double x = (a_*a.getX() + b_*b.getX() + c_*c.getX())/(a_+b_+c_);
        double y = (a_*a.getY() + b_*b.getY() + c_*c.getY())/(a_+b_+c_);

        Point.Double current = new Point.Double(x,y);

        double test_dist = 2000;
        double accuracy = .00000000001;
        double min_dist = current.distance(a) + current.distance(b) +current.distance(c);

        while(test_dist > accuracy){

            boolean not_found = true;

            Point.Double[] temp = new Point.Double[4];

            temp[0] = new Point.Double(current.getX() + test_dist , current.getY());
            temp[1] = new Point.Double(current.getX() - test_dist , current.getY());
            temp[2] = new Point.Double(current.getX() , current.getY() + test_dist);
            temp[3] = new Point.Double(current.getX() , current.getY() - test_dist);

            for (int i = 0; i < 4; i++) {

                double temp_dist = temp[i].distance(a) + temp[i].distance(b) + temp[i].distance(c);

                if(temp_dist < min_dist) {
                    min_dist = temp_dist;
                    current = temp[i];
                    not_found = false;
                    break;
                }
            }

            if(not_found)
                test_dist /= 2;
        }

        System.out.printf("%f %f", current.getX(), current.getY());
    }
}
