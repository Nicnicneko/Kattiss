import java.util.*;
import java.io.*;

public class SodaSurpler {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int meow = nya.nextInt() + nya.nextInt();
        int mew = nya.nextInt();
        int count = 0;
        while(meow >= mew) {
            count += meow / mew;
            meow = meow / mew + meow % mew;
        }
        System.out.println(count);
    }
}
