import java.util.*;
import java.io.*;

public class HelpAPhD {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = Integer.parseInt(nya.nextLine());
        for (int i = 0; i < cats; i++) {
            String temp = nya.nextLine();
            if (temp.equals("P=NP"))
                System.out.println("skipped");
            else {
                int[] temper = Arrays.stream(temp.split("\\+")).mapToInt(Integer::parseInt).toArray();
                System.out.println(temper[0] + temper[1]);
            }
        }
    }
}
