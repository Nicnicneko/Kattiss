import java.util.*;
import java.io.*;

public class SifferProdukt {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        String mew = nya.readLine();
        while (mew.length() > 1) {
            mew = Integer.toString(Arrays.stream(mew.replaceAll("0*", "").split("(?<=\\d)0*(?=\\d)")).mapToInt(Integer::parseInt).reduce(1, (a,b)->a*b));
        }
        System.out.println(mew);
    }
}
