import java.util.*;
import java.io.*;

public class Easiest {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        
        while(true) {
            int meow = nya.nextInt();
            if(meow == 0) break;
            int meows = dsum(meow);

            for (int i = 11; i < Integer.MAX_VALUE; i++)
                if(meows == dsum(meow*i)) {
                    System.out.println(i);
                    break;
                }
        }
    }

    public static int dsum(int i){
        int sum = 0;
        while(i > 0){
            sum+=i%10;
            i/=10;
        }
        return sum;
    }
}
