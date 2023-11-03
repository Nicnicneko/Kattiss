import java.util.*;
import java.io.*;

public class JumboJavelin {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int times = Integer.parseInt(nya.nextLine());
        int sum = 0;
        for(int i = 0; i++ < times; sum += Integer.parseInt(nya.nextLine())){}
        System.out.println(sum - --times);
    }
}
