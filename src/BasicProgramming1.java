import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class BasicProgramming1 {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int[] data = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] A = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        switch(data[1]){
            case 1:
                System.out.println(7); break;
            case 2:
                System.out.println(A[0] > A[1] ? "Bigger" : A[0] == A[1] ? "Equal" : "Smaller"); break;
            case 3:
                System.out.println(Arrays.stream(Arrays.copyOfRange(A, 0, 3)).sorted().toArray()[1]); break;
            case 4:
                System.out.println(Arrays.stream(A).mapToLong(n -> (long)n).sum()); break;
            case 5:
                System.out.println(Arrays.stream(A).filter(n -> n % 2 == 0).mapToLong(n -> (long)n).sum()); break;
            case 6:
                Arrays.stream(A).forEach(n -> System.out.print((char)(n % 26 + 97))); break;
            case 7:
                System.out.println(new String[] {"Cyclic", "Out", "Done"}[Stream.iterate(A[0] >= A.length ? -1 : A[A[0]], i -> i < A.length && i > -1 ? A[i] : -1).limit(A.length).mapToInt(n -> n == -1 ? 1 : n == A.length -1 ? 2 : 0).max().getAsInt()]);
//                HashSet<Integer> blah = new HashSet<>();
//                for (int i = 0;  ; i = A[i]) {
//                    if(i >= A.length){
//                        System.out.println("Out");
//                        break;
//                    } else if(i == A.length - 1){
//                        System.out.println("Done");
//                        break;
//                    } else if(!blah.add(i)){
//                        System.out.println("Cyclic");
//                        break;
//                    }
//                } break;
        }
    }
}
