import java.util.*;
import java.io.*;

public class ReverseBinary {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(Integer.parseInt(new StringBuilder(Integer.toString(nya.nextInt(),2)).reverse().toString() , 2));
    }
}
