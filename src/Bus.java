import java.util.*;
import java.io.*;

public class Bus {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        while(mew-->0){
            System.out.println((int)Math.pow(2, nya.nextInt()) - 1);
        }
    }
}
