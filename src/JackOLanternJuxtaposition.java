import java.util.*;
import java.io.*;

public class JackOLanternJuxtaposition {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).reduce(1, (a,b) -> a*b));
    }
}
