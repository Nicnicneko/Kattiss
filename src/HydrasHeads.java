import java.util.*;
import java.io.*;

public class HydrasHeads {
    private static int[][] mat = new int[101][101];
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        while(nya.hasNext()){
            int h = nya.nextInt(), t = nya.nextInt();
            if(h == t && h == 0)
                break;
            int ans = 0;
            while(true){
                if(h == 1 && t == 0){
                    ans = -1;
                    break;
                }else if(t % 2 == 1 || (h + t/2) % 2 == 1) {
                    t++;
                    ans++;
                }
                else{
                    ans += t/2 + (h + t/2)/2;
                    break;
                }
            }
            System.out.println(ans);
        }
    }

}
