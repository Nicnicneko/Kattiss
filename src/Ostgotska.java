import java.util.*;
import java.io.*;

public class Ostgotska {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        String[] blob = nya.nextLine().split(" ");

        System.out.println(Arrays.stream(blob).mapToInt(x -> x.matches(".*ae.*") ? 1 : 0).sum() / (double)blob.length >= .4 ? "dae ae ju traeligt va" : "haer talar vi rikssvenska");
    }
}
