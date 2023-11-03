import java.util.*;
import java.io.*;

public class Tetris {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[][] mews = new int[13][];

        mews[0] = new int[]{0};
        mews[1] = new int[]{0,0};
        mews[2] = new int[]{0,1};
        mews[3] = new int[]{0,2};
        mews[4] = new int[]{1,0};
        mews[5] = new int[]{2,0};
        mews[6] = new int[]{0,0,0};
        mews[7] = new int[]{0,0,1};
        mews[8] = new int[]{0,1,1};
        mews[9] = new int[]{1,0,0};
        mews[10]= new int[]{1,0,1};
        mews[11]= new int[]{1,1,0};
        mews[12]= new int[]{0,0,0,0};

        int[][] tet = new int[8][];

        tet[1] = new int[]{0, 12};
        tet[2] = new int[]{1};
        tet[3] = new int[]{7, 4};
        tet[4] = new int[]{9, 2};
        tet[5] = new int[]{6, 2, 10, 4};
        tet[6] = new int[]{6, 1, 8, 5};
        tet[7] = new int[]{6, 3, 11, 1};

        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] field = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int ans = 0;

        for(int i: tet[data[1]]) {
            for(int j = 0; j < field.length - mews[i].length + 1; j++) {
                if(meow(Arrays.copyOfRange(field, j, j + mews[i].length), mews[i]))
                    ans++;
            }
        }

        System.out.println(ans);
    }

    public static boolean meow(int[] sec, int[] test) {
        //System.out.printf("%s %s\n", Arrays.toString(sec), Arrays.toString(test));
        while(Arrays.stream(sec).noneMatch(x->x==0)) {
            for(int i = 0; i < sec.length; i++) sec[i]--;
        }
        return Arrays.equals(sec, test);
    }
}
/*
         0       90        180     270
1 Line   [0]     [0,0,0,0]
2 Square [0,0]
3 S      [0,0,1] [1,0]
4 Z      [1,0,0] [0,1]
5 T      [0,0,0] [0,1]     [1,0,1] [1,0]
6 L      [0,0,0] [0,0]     [0,1,1] [2,0]
7 J      [0,0,0] [0,2]     [1,1,0] [0,0]
*/