import java.util.*;
import java.io.*;

public class BookingARoom {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        HashSet<Integer> boop = new HashSet<>();

        int[] data = {nya.nextInt(), nya.nextInt()};

        if(data[0] == data[1]){
            System.out.println("too late");
            return;
        }

        for (int i = 1; i <= data[0]; i++) {
            boop.add(i);
        }

        for (int i = 0; i < data[1]; i++) {
            boop.remove(nya.nextInt());
        }

        System.out.println(boop.iterator().next());
    }
}
