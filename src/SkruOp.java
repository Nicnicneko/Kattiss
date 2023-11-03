import java.util.*;
import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SkruOp {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int vol = 7;
        for(int i = Integer.parseInt(nya.readLine()); i > 0; vol += nya.readLine().equals("Skru op!") ? 1 : -1, vol = Math.max(0, Math.min(10, vol)), i--);
        System.out.println(vol);
    }
}
