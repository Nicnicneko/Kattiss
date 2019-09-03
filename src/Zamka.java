import java.util.*;
import java.io.*;

public class Zamka {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int l = nya.nextInt();
        int d = nya.nextInt();
        int x = nya.nextInt();
        for (int i = l; i <= d; i++) {
            if(dsum(i) == x) {
                System.out.println(i);
                break;
            }
        }
        for (int i = d; i >= l; i--) {
            if(dsum(i) == x) {
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
