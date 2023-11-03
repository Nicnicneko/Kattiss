import java.util.*;
import java.io.*;

public class FiftyShades {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int times = Integer.parseInt(nya.nextLine());

        int ans = 0;

        for(;times-->0;)
            ans += nya.nextLine().toLowerCase().matches(".*pink.*|.*rose.*") ? 1 : 0;

        System.out.println(ans == 0 ? "I must watch Star Wars with my daughter" : ans);
    }
}
