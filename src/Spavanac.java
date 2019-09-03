import java.util.*;
import java.io.*;

public class Spavanac {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        Calendar bob = new Calendar.Builder().setTimeOfDay(nya.nextInt(),nya.nextInt(),0).build();
        bob.add(Calendar.MINUTE,-45);
        System.out.printf("%d %d",bob.get(Calendar.HOUR_OF_DAY),bob.get(Calendar.MINUTE));
    }
}
