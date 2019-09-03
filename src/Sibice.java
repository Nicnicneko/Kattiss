import java.util.*;
import java.io.*;

public class Sibice {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int nums = nya.nextInt();
        int max = (int)Math.hypot(nya.nextInt(),nya.nextInt());

        while(nums-->0){
            System.out.println(nya.nextInt() <= max?"DA":"NE");
        }
    }
}
