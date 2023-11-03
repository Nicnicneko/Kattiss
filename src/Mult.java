import java.util.*;
import java.io.*;

public class Mult {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int cur = -1;
        for(int i = Integer.parseInt(nya.readLine()); i > 1; i--){
            int temp = Integer.parseInt(nya.readLine());
            if (cur == -1) {
                cur = temp;
            }
            else if(temp % cur == 0){
                System.out.println(temp);
                cur = -1;
            }
        }
    }
}
