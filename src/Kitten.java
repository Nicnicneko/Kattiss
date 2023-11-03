import java.util.*;
import java.io.*;

public class Kitten {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        boolean[][] adj = new boolean[101][101];

        int cat = Integer.parseInt(nya.nextLine());

        while(nya.hasNext()){
            int[] data = Arrays.stream(nya.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if(data[0] < 0)
                break;

            for (int i = 1; i < data.length; i++)
                adj[data[i]][data[0]] = true;
        }

        LinkedList<Integer> ahhh = new LinkedList<>();

        ahhh.add(cat);

        while(!ahhh.isEmpty()){
            int cur = ahhh.remove();
            System.out.print(cur + " ");
            for (int i = 1; i < adj[cur].length; i++) {
                if(adj[cur][i])
                    ahhh.add(i);
            }
        }

    }
}
