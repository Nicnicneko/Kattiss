import java.util.*;
import java.io.*;

public class ClosingTheLoop {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        for(int i = 0; i < mew; i++){
            int meow = Integer.parseInt(nya.nextLine());

            ArrayList<Integer> blue = new ArrayList<>(), red = new ArrayList<>();

            for (int j = 0; j < meow; j++) {
                String temp = nya.next();
                if(temp.charAt(temp.length()-1) == 'B')
                    blue.add(Integer.parseInt(temp.replaceAll("B", "")));
                else
                    red.add(Integer.parseInt(temp.replaceAll("R", "")));
            }

            nya.nextLine();

            Collections.sort(blue, Collections.reverseOrder());
            Collections.sort(red, Collections.reverseOrder());

            int ans = 0;

            for (int j = 0; j < Math.min(blue.size(), red.size()); j++) {
                ans += blue.get(j) + red.get(j);
            }

            System.out.printf("Case #%d: %d\n", i+1, ans - 2*Math.min(blue.size(), red.size()));
        }
    }
}
