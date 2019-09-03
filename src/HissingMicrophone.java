import java.util.*;
import java.io.*;

public class HissingMicrophone {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        System.out.println(nya.nextLine().matches(".*ss.*")?"hiss":"no hiss");
    }
}
