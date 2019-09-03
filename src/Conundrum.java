import java.util.*;
import java.io.*;

public class Conundrum {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String a = nya.nextLine();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if(i % 3 == 0)
                if(a.charAt(i) != 'P')
                    count++;
            if(i % 3 == 1)
                if(a.charAt(i) != 'E')
                    count++;
            if(i % 3 == 2)
                if(a.charAt(i) != 'R')
                    count++;
        }
        System.out.println(count);
    }
}
