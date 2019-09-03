import java.util.*;
import java.io.*;

public class Ladder {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println((int)(Math.ceil(nya.nextDouble()/Math.sin(Math.toRadians(nya.nextDouble())))));
    }
}
