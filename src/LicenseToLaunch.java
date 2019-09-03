import java.util.*;
import java.io.*;

public class LicenseToLaunch {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        nya.nextLine();
        int[] cat = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int mew = -1;
        int meow = 1000000;

        for (int i = 0; i < cat.length; i++) {
            if(cat[i] < meow){
                meow = cat[i];
                mew = i;
            }
        }

        System.out.println(mew);
    }
}
