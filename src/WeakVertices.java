import java.util.*;
import java.io.*;

public class WeakVertices {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        while(nya.hasNext()) {
            int size = Integer.parseInt(nya.nextLine());
            if (size == -1) break;

            int[][] adj = new int[size][size];

            for (int i = 0; i < size; i++) {
                adj[i] = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            ArrayList<Integer> tri = new ArrayList();

            for (int i = 0; i < size; i++) {
                Set<Integer> cons = new HashSet<>();
                for (int j = 0; j < size; j++) {
                    if(adj[i][j] == 1)
                        cons.add(j);
                }

                for(int j: cons){
                    Set<Integer> temp = new HashSet<>();
                    for (int k = 0; k < size; k++) {
                        if(adj[j][k] == 1)
                            temp.add(k);
                    }
                    temp.retainAll(cons);
                    if(temp.size() > 0)
                        tri.add(i);
                }
            }

            for (int i = 0; i < size; i++) {
                if(!tri.contains(i))
                    System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
