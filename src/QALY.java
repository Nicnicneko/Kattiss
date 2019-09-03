import java.util.*;
import java.io.*;

public class QALY {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int times = Integer.parseInt(nya.nextLine());
        double sum = 0;
        while(times-->0){
            sum += nya.nextDouble() * nya.nextDouble();
        }
        System.out.printf("%.4f",sum);
    }
}
