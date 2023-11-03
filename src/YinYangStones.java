import java.util.*;
import java.io.*;

public class YinYangStones {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        String mew = nya.nextLine();

        System.out.println(mew.replaceAll("W", "").length() == mew.replaceAll("B", "").length() ? 1 : 0);
    }
}
