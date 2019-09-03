import java.util.*;
import java.io.*;

public class Harshad {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int n = nya.nextInt();
        while(true){
            if(n%dsum(n) == 0) {
                System.out.println(n);
                break;
            }
            else
                n++;
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
