import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class StopWatch {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        AtomicBoolean mew = new AtomicBoolean(true);
        System.out.println(Integer.parseInt(nya.readLine()) % 2 == 1 ? "still running" : nya.lines().mapToInt(Integer::parseInt).map(x -> mew.getAndSet(!mew.get()) ? -x : x).sum());
    }
}
