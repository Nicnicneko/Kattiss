import java.util.*;
import java.io.*;

public class NoDup {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String test = nya.nextLine();
        String[] cat = test.split(" ");
        HashSet<String> mews = new HashSet(Arrays.asList(cat));
        String meow = "";
        for(String x:mews)
            meow += x;
        System.out.println(meow.length() == test.replaceAll(" ","").length()?"yes":"no");
    }
}
