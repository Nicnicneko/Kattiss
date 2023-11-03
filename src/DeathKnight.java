import java.util.*;
import java.io.*;

public class DeathKnight {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int mew = Integer.parseInt(nya.nextLine());
        int ans = 0;

        for(; mew-->0; ans += nya.nextLine().matches(".*CD.*") ? 0 : 1){}
        System.out.println(ans);
    }
}
