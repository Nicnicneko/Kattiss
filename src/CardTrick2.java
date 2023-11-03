import java.util.*;
import java.io.*;

public class CardTrick2 {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = nya.nextInt();

        while(mew-->0){
            int[] ans = new int[nya.nextInt()];
            int pos = 0;

            for (int i = 1; i <= ans.length; i++) {
                int temp = i;
                while(true){
                    if(ans[pos % ans.length] == 0) {
                        if(temp == 0) {
                            ans[pos % ans.length] = i;
                            break;
                        }
                        temp--;
                    }
                    pos++;
                }
            }
            System.out.println(Arrays.toString(ans).replaceAll("[\\[\\],]", ""));
        }
    }
}
