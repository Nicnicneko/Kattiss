import java.util.*;
import java.io.*;

public class Wheels {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int times = Integer.parseInt(nya.nextLine());

        for(;times-->0;){

        }
    }
}

class Gear{
    public int x, y, dir;
    public double r;
    public Gear driver, drivee;

    public enum direction{
        not_moving, clockwise, counterclockwise
    }

    public Gear(int x, int y, int r, int dir){
        this.x = x;
        this.y = y;
        this.r = r;
        this.dir = dir;
    }

    public void setDriver(Gear g){
        driver = g;
    }

    public void setDrivee(Gear g){
        drivee = g;
    }


}
