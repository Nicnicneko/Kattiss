import java.util.*;
import java.io.*;

public class ICPCAwards {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();
        HashSet<String> cat = new HashSet();
        for (int i = 0; i < cats; i++) {
            String uni = nya.next();
            String team = nya.next();
            if(!cat.contains(uni) && cat.size() < 12) {
                System.out.printf("%s %s\n", uni, team);
                cat.add(uni);
            }
        }
    }
}
