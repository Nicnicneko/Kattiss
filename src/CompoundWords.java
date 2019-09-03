import java.util.*;
import java.io.*;

public class CompoundWords {
    private static TreeSet<String> mew = new TreeSet();
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        ArrayList<String> meow = new ArrayList();
        while(nya.hasNext())
            meow.add(nya.next());
        for (int i = 0; i < meow.size(); i++)
            for (int j = 0; j < meow.size(); j++)
                if(i != j)
                    mew.add(meow.get(i) + meow.get(j));
        for(String x: mew)
            System.out.println(x);
    }
}
