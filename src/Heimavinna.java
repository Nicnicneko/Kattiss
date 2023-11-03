import java.util.*;
import java.io.*;

public class Heimavinna {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Arrays.stream(nya.readLine().split(";")).mapToInt(x -> x.contains("-") ? Arrays.stream(x.split("-")).mapToInt(Integer::parseInt).reduce((a,b) -> b-a+1).getAsInt(): 1).sum());
    }
}
