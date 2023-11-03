import java.util.*;
import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PlantingTrees {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(nya.readLine());
        AtomicInteger daysEx = new AtomicInteger(1);
        AtomicInteger max = new AtomicInteger(t);

        Arrays.stream(nya.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Collections.reverseOrder())
                //.takeWhile(x -> x+daysEx.get() >= max.get())
                .forEach(x -> max.set(Math.max(max.get(),x+daysEx.getAndIncrement())));

        System.out.println(max.get() + 1);
    }
}

/*
M - max days for a tree to grow
t - total number of trees
ans = M + max(some element - t)

5 6 7 8 9 10
*/