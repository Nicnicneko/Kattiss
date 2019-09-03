import java.util.*;
import java.io.*;

public class SumSquaredDigits {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();

        for (int i = 0; i < cats; i++) {
            System.out.printf("%d %d\n",nya.nextInt(),ssd(nya.nextInt(),nya.nextInt()));
        }
        //System.out.println(Integer.toString(987654321,16));
    }

    public static int ssd(int b, int n) {
        String meow = Integer.toString(n,b);
        int sum = 0;
        while(meow.length() > 0) {
            char mew = meow.charAt(meow.length()-1);
            mew -= mew > 96?87:48;
            sum += Math.pow(mew,2);
            meow = meow.substring(0,meow.length()-1);
        }
        //System.out.println(sum);
        return sum;
    }

}
