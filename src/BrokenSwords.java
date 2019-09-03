import java.util.*;
import java.io.*;

public class BrokenSwords {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();
        int tb = 0;
        int lr = 0;
        for (int i = 0; i < cats; i++) {
            String sword = nya.next();
            if(sword.charAt(0) == '0')
                tb++;
            if(sword.charAt(1) == '0')
                tb++;
            if(sword.charAt(2) == '0')
                lr++;
            if(sword.charAt(3) == '0')
                lr++;
        }
        System.out.printf("%d %d %d\n",Math.min(tb/2,lr/2), tb - Math.min(tb/2,lr/2)*2, lr - Math.min(tb/2,lr/2)*2);
    }
}
