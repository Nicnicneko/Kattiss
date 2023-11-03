import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class KnotKnowledge {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        nya.readLine();
        List<String> mew = Arrays.stream(nya.readLine().split(" ")).collect(Collectors.toList());
        mew.removeAll(Arrays.stream(nya.readLine().split(" ")).collect(Collectors.toList()));
        System.out.println(mew.get(0));
    }
}
