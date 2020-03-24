import java.awt.geom.*;
import java.util.*;
import java.io.*;

public class CountingTriangles {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cat;
        while((cat = nya.nextInt()) != 0) {
            Line2D.Double[] meow = new Line2D.Double[cat];
            for (int i = 0; i < cat; i++)
                meow[i] = new Line2D.Double(nya.nextDouble() , nya.nextDouble() , nya.nextDouble() , nya.nextDouble());

            int paws = 0;

            for (int i = 0; i < meow.length-2; i++) {
                for (int j = i+1; j < meow.length - 1; j++) {
                    for (int k = j+1; k < meow.length; k++) {
                        if(meow[i].intersectsLine(meow[j]) && meow[j].intersectsLine(meow[k]) && meow[k].intersectsLine(meow[i]))
                            paws++;
                    }
                }
            }
            System.out.println(paws);
        }
    }
}
