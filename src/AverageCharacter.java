import java.util.*;
import java.io.*;

public class AverageCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        System.out.println((char)nya.readLine().chars().average().getAsDouble());
    }
}
