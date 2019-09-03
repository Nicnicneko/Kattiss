import java.util.*;
import java.io.*;

public class IsItHalloween {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        System.out.println(nya.nextLine().matches("OCT 31|DEC 25")?"yup":"nope");
    }
}
