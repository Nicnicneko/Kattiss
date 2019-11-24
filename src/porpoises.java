import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class porpoises {
    public static void main(String[] args) throws IOException {
        //Scanner nya = new Scanner(new File(""));

        System.out.println(fib(281474976710656L));

    }

    public static BigInteger fib(long i){
        if((i-=2) < 0)
            return BigInteger.ONE;

        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger temp = new BigInteger("1");


        while(i-->0){
            temp = b;
            b = a.add(b);
            a = temp;
        }

        return b;
    }
}
