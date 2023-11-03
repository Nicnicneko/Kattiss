import java.util.*;
import java.io.*;

public class Problems99 {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int mew = Integer.parseInt(nya.readLine());
        int mow = mew;
        mow++;

        for(;;){
            if(++mew % 100 == 0){
                System.out.println(mew - 1);
                break;
            }
            if(mow-- % 100 == 0 && mow > 0) {
                System.out.println(mow);
                break;
            }
        }
    }
}
