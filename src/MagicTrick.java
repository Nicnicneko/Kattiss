import java.util.*;
import java.io.*;

public class MagicTrick {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(nya.nextLine().matches(".*(.).*\\1.*") ? 0 : 1);
    }
}
