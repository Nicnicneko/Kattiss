import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class FibonacciCycles {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int times = Integer.parseInt(nya.nextLine());

        while (times-- > 0) {
            System.out.println(fibRep(Integer.parseInt(nya.nextLine())));
        }
    }

    private static int fibRep(int m){
        HashMap<BigInteger, Integer> found = new HashMap();
        BigInteger a = new BigInteger("1"), b = new BigInteger("2"), mod = new BigInteger(Integer.toString(m));

        for(int i = 2;; i++){
            BigInteger temp = b;
            b = b.add(a);
            a = temp;
            if(!found.containsKey(a.mod(mod)))
                found.put(a.mod(mod), i);
            else
                return found.get(a.mod(mod));
            //System.out.printf("%d %s\n", a, found);
        }
    }
}
