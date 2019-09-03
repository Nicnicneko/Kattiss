import java.util.*;
import java.io.*;

public class Faktor {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println((int)Math.ceil(nya.nextDouble() * (nya.nextDouble() - .999999)));
    }
}
