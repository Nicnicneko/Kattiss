import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        boolean[][] adj = new boolean[5][5];

        int mew = Integer.parseInt(nya.nextLine());

        for (int i = 0; i < mew; i++) {
            int a = nya.nextInt(), b = nya.nextInt();
            adj[a][b] = true;
            adj[b][a] = true;
        }

        int start = nya.nextInt(), end = nya.nextInt();

        LinkedList<int[]> q = new LinkedList<>();
        HashSet<Integer> v = new HashSet<>();

        q.add(new int[] {start, 0});

        while(!q.isEmpty()){
            int[] temp = q.poll();

            if(!v.add(temp[0]))
                continue;

            if(temp[0] == end){
                System.out.println(temp[1]);
                return;
            }

            for (int i = 0; i < adj[temp[0]].length; i++) {
                if(adj[temp[0]][i])
                    q.add(new int[] {i, temp[1]+1});
            }
        }



        //System.out.println(go(start, end, adj, 0));
    }

    private static int go(int start, int end, boolean[][] adj, int len){

        System.out.printf("%d %d %d\n", start, end, len);

        if(start == end)
            return len;

        if(!(adj[start][0] | adj[start][1] | adj[start][2] | adj[start][3] | adj[start][4]))
            return 999999999;

        int ans = 999999999;
        for (int i = 0; i < adj[start].length; i++) {
            if(adj[start][i]) {
                boolean[] temp = adj[start];
                adj[start] = new boolean[5];
                ans = Math.min(ans, go(i, end, adj, len + 1));
                adj[start] = temp;
            }
        }
        len = ans;

        return len;
    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    private static char[][] rot(char[][] mat){
        char[][] temp = new char[mat[0].length][mat.length];

        for (int i = 0; i < temp.length; i++)
            for (int j = 0; j < temp[i].length; j++)
                temp[i][j] = mat[mat.length-1-j][i];

        return temp;
    }
}
