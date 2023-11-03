import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class CodeToSaveLives {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        for(int i = Integer.parseInt(nya.readLine()); i > 0; i--)
            System.out.println(Integer.toString(Arrays.stream(new String[]{nya.readLine(), nya.readLine()}).map(x -> x.replaceAll(" ", "")).mapToInt(Integer::parseInt).sum()).replaceAll(".(?!=.)", "$0 "));
    }
}
