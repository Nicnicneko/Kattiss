import java.util.*;
import java.io.*;

public class Pot {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int times = Integer.parseInt(nya.nextLine());
        long cool = 0;

        while(times-->0){
            int temp = nya.nextInt();
            cool += Math.pow(temp/10,temp%10);
        }
        System.out.println(cool);
    }
}
