import java.util.*;
import java.io.*;

public class SecureDoors {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> chu = new HashSet<>();

        int mews = Integer.parseInt(nya.readLine());

        while(mews-->0) {
            String[] data = nya.readLine().split(" ");
            switch(data[0]){
                case "entry":
                    System.out.printf("%s entered%s\n", data[1], chu.add(data[1]) ? "" : " (ANOMALY)");
                    break;
                case "exit":
                    System.out.printf("%s exited%s\n", data[1], chu.remove(data[1]) ? "" : " (ANOMALY)");
            }
        }

    }
}
