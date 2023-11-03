import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicProgrammingEvil {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int[] data = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] A = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(
                data[1] == 1 ? 7 :
                data[1] == 2 ? A[0] > A[1] ? "Bigger" : A[0] == A[1] ? "Equal" : "Smaller" :
                data[1] == 3 ? Arrays.stream(Arrays.copyOfRange(A, 0, 3)).sorted().toArray()[1] :
                data[1] == 4 ? Arrays.stream(A).mapToLong(n -> (long)n).sum() :
                data[1] == 5 ? Arrays.stream(A).filter(n -> n % 2 == 0).mapToLong(n -> (long)n).sum() :
                data[1] == 6 ? Arrays.stream(A).mapToObj(n -> Character.toString((char)(n % 26 + 97))).collect(Collectors.joining()):
                        new String[] {"Cyclic", "Out", "Done"}[Stream.iterate(A[0] >= A.length ? -1 : A[A[0]], i -> i < A.length && i > -1 ? A[i] : -1).limit(A.length).mapToInt(n -> n == -1 ? 1 : n == A.length -1 ? 2 : 0).max().getAsInt()]
        );
    }
}
