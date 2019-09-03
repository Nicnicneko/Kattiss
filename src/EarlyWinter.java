import java.util.*;
import java.io.*;

public class EarlyWinter {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int years = nya.nextInt();
        int days = nya.nextInt();
        nya.nextLine();

        int[] samples = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int count = 0;

        for(int x: samples){
            if(x <= days)
                break;
            count++;
        }

        System.out.printf(years != count ? "It hadn't snowed this early in %d years!": "It had never snowed this early!", count);

    }
}
