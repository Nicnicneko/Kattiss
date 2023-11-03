import java.util.*;
import java.io.*;

public class OddGnome {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int mew = Integer.parseInt(nya.nextLine());

        while(mew-->0){
            int i = 2;
            nya.nextInt();
            int a = nya.nextInt(), b = nya.nextInt();
            while(b - a == 1){
                a = b;
                b = nya.nextInt();
                i++;
            }
            System.out.println(i);
            nya.nextLine();
        }
    }
}
