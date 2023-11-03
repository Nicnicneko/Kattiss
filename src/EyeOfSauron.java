import java.util.*;
import java.io.*;

public class EyeOfSauron {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(nya.nextLine().matches("(\\|*)\\(\\)(\\1)") ? "correct" : "fix");
    }
}
