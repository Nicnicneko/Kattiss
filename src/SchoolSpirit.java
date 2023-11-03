import java.util.*;
import java.io.*;

public class SchoolSpirit {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        ArrayList<Integer> stuff = new ArrayList<>();

        while(mew-->0)
            stuff.add(nya.nextInt());

        Collections.sort(stuff, Collections.reverseOrder());

        double ans = 0;

        for (int i = 0; i < stuff.size(); i++) {
            double temp = 0;
            for (int j = 0; j < stuff.size(); j++) {
                temp += j == i ? 0 : stuff.get(j) * Math.pow(.8, j < i ? j : j - 1);
            }
            temp /= 5;
            ans += temp;
        }

        double bleh = 0;

        for (int i = 0; i < stuff.size(); i++) {
            bleh += stuff.get(i) * Math.pow(.8, i);
        }

        System.out.printf("%f\n%f\n", bleh/5, ans/stuff.size());
    }
}
