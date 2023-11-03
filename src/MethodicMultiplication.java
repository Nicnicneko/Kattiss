import java.util.*;
import java.io.*;

public class MethodicMultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int mew = nya.lines().mapToInt(x -> x.replaceAll("[^S]", "").length()).reduce(1, (a,b) -> a*b);
        System.out.println("S(".repeat(mew) + "0" + ")".repeat(mew));
    }
}
