import java.util.*;
import java.io.*;

public class TwoStones {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(nya.nextInt() % 2 == 0?"Bob":"Alice");
    }
}
