import java.util.*;
import java.io.*;

public class Prozor {
    private static int meow[][];
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        char[][] mew = new char[nya.nextInt()][nya.nextInt()];
        int[][] _mew = new int[mew.length][mew[0].length];
        int rack = nya.nextInt();
        meow = new int[mew.length-rack+1][mew[0].length-rack+1];

        nya.nextLine();

        for (int i = 0; i < mew.length; i++) {
            mew[i] = nya.nextLine().toCharArray();
            for (int j = 0; j < mew[0].length; j++) {
                _mew[i][j] = mew[i][j] == 46 ? 0:1;
            }
        }

        int r = -1;
        int c = -1;
        int max = 0;

        for (int i = 0; i < meow.length; i++) {
            for (int j = 0; j < meow[i].length; j++) {
                arrSum(_mew,rack,i,j);
                if(meow[i][j] > max){
                    max = meow[i][j];
                    r = i;
                    c = j;
                }

            }
        }
        System.out.println(max);
        for (int i = 0; i < mew.length; i++) {
            for (int j = 0; j < mew[i].length; j++) {
                if(i == r && (j == c || j == c + rack - 1) || i == r + rack - 1 && (j == c || j == c + rack - 1))
                    System.out.print('+');
                else if( (i == r || i == r + rack - 1) && j > c && j < c + rack -1)
                    System.out.print('-');
                else if( (j == c || j == c + rack - 1) && i > r && i < r + rack -1)
                    System.out.print('|');
                else
                    System.out.print(mew[i][j]);
            }
            System.out.println();
        }
//        for(int[] x:_mew)
//            System.out.println(Arrays.toString(x));
//        for(char[] x:mew)
//            System.out.println(Arrays.toString(x));
//        for(int[] x:meow)
//            System.out.println(Arrays.toString(x));

    }

    private static void arrSum(int[][] mew, int size, int r, int c){
        int temp = 0;
        for (int i = r + 1; i < r + size-1; i++) {
            temp += Arrays.stream(mew[i],c+1,c+size-1).sum();
        }
        meow[r][c] = temp;
    }
}
