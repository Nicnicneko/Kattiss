import java.util.*;
import java.io.*;

public class BatterUp {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        nya.nextLine();
        System.out.println(Arrays.stream(nya.nextLine().replaceAll("-1\\s*","").split("\\s+")).mapToDouble(Double::parseDouble).average().getAsDouble());
    }
}
