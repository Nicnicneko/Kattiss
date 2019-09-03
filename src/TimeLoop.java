import java.util.*;
import java.io.*;

public class TimeLoop {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int times = nya.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.printf("%d Abracadabra\n",i+1);
        }
    }
}
