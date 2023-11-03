import java.util.*;
import java.io.*;

public class SquarePeg2 {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int[] data = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        PriorityQueue<Double> plots = new PriorityQueue<>(Comparator.reverseOrder()), houses = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < data[0]; i++) {
            plots.offer(nya.nextDouble());
        }

        for (int i = 0; i < data[1]; i++) {
            houses.offer(nya.nextDouble());
        }

        for (int i = 0; i < data[2]; i++) {
            houses.offer(nya.nextDouble() * Math.sqrt(2) / 2);
        }

        int ans = 0;

//        System.out.printf("%s\n%s\n", plots, houses);

        while(!plots.isEmpty() && !houses.isEmpty()){
            if(plots.peek() > houses.peek()){
                ans++;
                plots.poll();
                houses.poll();
            } else {
                houses.poll();
            }
        }

        System.out.println(ans);
    }
}
