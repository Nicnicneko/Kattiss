import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class TowersOfPower2 {
    public static void main(String[] args) throws IOException {
//        Scanner nya = new Scanner(System.in);
//        int cats = Integer.parseInt(nya.nextLine());
//        BigInteger[][] meow = new BigInteger[cats][101];
//        for (int i = 0; i < cats; i++) {
//            Arrays.fill(meow[i],new BigInteger("0"));
//            int[] temp = Arrays.stream(nya.nextLine().split("\\^")).mapToInt(Integer::parseInt).toArray();
//            int a = 2;
//            while(temp[0] > 1)
//                if(temp[0] % a == 0) {
//                    meow[i][a] = meow[i][a].add(BigInteger.ONE);
//                    temp[0]/=a;
//                }
//                else
//                    a++;
//
//            for (int x = 1; x < temp.length; x++)
//                for (int j = 0; j < 100; j++)
//                    meow[i][j] = meow[i][j].multiply(new BigInteger(Integer.toString(temp[x])));
//
//        }
//        for(BigInteger[] x: meow)
//            System.out.println(Arrays.toString(x));
        Scanner nya = new Scanner(System.in);
        int cats = Integer.parseInt(nya.nextLine());
        String[] meow = new String[cats];
        for (int i = 0; i < cats; i++)
            meow[i] = nya.nextLine();

        for (int i = 1; i < cats; i++) {
            int j = i;
            while(i > 0 && cool(meow[i],meow[i-1])) {
                String temp = meow[i-1];
                meow[i-1] = meow[i];
                meow[i] = temp;
                i--;
            }
            i = j;
        }

        System.out.println(Arrays.toString(meow));

    }

    private static boolean cool(String x, String y){
        double[] a,b;
        if(x.length() > y.length()) {
            a = Arrays.stream(x.split("\\^")).mapToDouble(Double::parseDouble).toArray();
            b = Arrays.stream(y.split("\\^")).mapToDouble(Double::parseDouble).toArray();
        }else{
            b = Arrays.stream(x.split("\\^")).mapToDouble(Double::parseDouble).toArray();
            a = Arrays.stream(y.split("\\^")).mapToDouble(Double::parseDouble).toArray();
        }
        int ib = b.length-1;
        for (int i = a.length-1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                a[j] = Math.log10(a[j]);
            }
            for (int j = ib; j >= 0; j--) {
                b[j] = Math.log10(b[j]);
            }
            if(ib < 0)
                for (int j = 0; j < b.length; j++) {
                    b[j] = Math.log10(b[j]);
                }
            System.out.printf("%s %s\n",Arrays.toString(a),Arrays.toString(b));
            if(a[0] < 1 ||  b[0] < 1)
                break;
            ib--;
        }

        double m = Arrays.stream(a).reduce((t,z)->t*z).getAsDouble();
        double n = Arrays.stream(b).reduce((t,z)->t*z).getAsDouble();


        return m < n;
    }

    private static double wow(String x){
        double[] a = Arrays.stream(x.split("\\^")).mapToDouble(Double::parseDouble).toArray();
        for (int i = a.length-1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                a[j] = Math.log(a[j]);
            }
        }
        double m = Arrays.stream(a).reduce((t,y)->t*y).getAsDouble();

        return m;
    }
}
