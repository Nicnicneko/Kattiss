import java.util.*;
import java.io.*;

public class PrincessPeach {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int total = nya.nextInt();
        int meow = nya.nextInt();
        HashSet<Integer> found = new HashSet<>();
        for (int i = 0; i < meow; i++)
            found.add(nya.nextInt());
        for (int i = 0; i < total; i++)
            if(!found.contains(i))
                System.out.println(i);
        System.out.printf("Mario got %d of the dangerous obstacles.", found.size());
    }
}
