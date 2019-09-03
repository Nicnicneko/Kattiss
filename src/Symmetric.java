import java.util.*;
import java.io.*;

public class Symmetric {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int purr = 1;
        while(true) {
            int n = nya.nextInt();
            if(n == 0)
                break;
            String[] cat = new String[n];

            for(int i = 0; i < n/2; i++) {
                cat[i] = nya.next();
                cat[n-1-i] = nya.next();
            }

            if(n % 2 == 1)
                cat[n/2] = nya.next();

            System.out.printf("SET %d\n",purr++);

            for(String meow: cat)
                System.out.println(meow);
        }

    }
}
