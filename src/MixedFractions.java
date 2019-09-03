import java.util.*;
import java.io.*;

public class MixedFractions {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        while(true) {
            int a = nya.nextInt();
            int b = nya.nextInt();
            if(a == 0 && b == 0)
                break;
            System.out.printf("%d %d / %d\n", a / b, a % b, b);
        }
    }
}
