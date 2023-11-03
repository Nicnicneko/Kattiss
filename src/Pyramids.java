import java.util.*;
import java.io.*;

public class Pyramids {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int mew = Integer.parseInt(nya.readLine());
        int i = 1;
        for(; (mew -= i*i) >= 0; i+=2);
        System.out.println(i/2);
    }
}
