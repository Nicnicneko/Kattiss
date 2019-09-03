import java.util.*;
import java.io.*;

public class HangingOut {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int max = nya.nextInt();
        int times = nya.nextInt();
        int count = 0;
        int current = 0;

        for (int i = 0; i < times; i++) {
            String boo = nya.next();
            int peeps = nya.nextInt();

            if(boo.equals("enter")){
                if(current + peeps > max)
                    count++;
                else{
                    current += peeps;
                }
            }
            else
                current -= peeps;
        }
        System.out.println(count);
    }
}
