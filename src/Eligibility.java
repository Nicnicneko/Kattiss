import java.util.*;
import java.io.*;

public class Eligibility {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        for (int i = 0; i < mew; i++) {
            String name = nya.next();
            int[] pos = Arrays.stream(nya.next().split("/")).mapToInt(Integer::parseInt).toArray();
            int[] birth = Arrays.stream(nya.next().split("/")).mapToInt(Integer::parseInt).toArray();
            int courses = nya.nextInt();

            GregorianCalendar start = new GregorianCalendar(pos[0], pos[1] - 1, pos[2]);
            GregorianCalendar bir = new GregorianCalendar(birth[0], birth[1] - 1, birth[2]);

            if(start.get(Calendar.YEAR) >= 2010 || bir.get(Calendar.YEAR) >= 1991)
                System.out.printf("%s %s\n", name, "eligible");
            else if(courses > 40)
                System.out.printf("%s %s\n", name, "ineligible");
            else
                System.out.printf("%s %s\n", name, "coach petitions");
        }
    }
}
