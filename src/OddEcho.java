import java.util.*;
import java.io.*;

public class OddEcho {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int mew = Integer.parseInt(nya.readLine());
        for(int i = 0; i < mew; i++){
            System.out.printf("%s\n", nya.readLine());
            if(i++ % 2 == 0)
                nya.readLine();
        }
    }
}
