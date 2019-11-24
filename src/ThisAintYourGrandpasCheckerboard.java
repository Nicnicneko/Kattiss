import java.util.*;
import java.io.*;

public class ThisAintYourGrandpasCheckerboard {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int n = Integer.parseInt(nya.nextLine());
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            board[i] = nya.nextLine().toCharArray();


    }
}
