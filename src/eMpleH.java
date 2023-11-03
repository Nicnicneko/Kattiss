import java.util.*;
import java.io.*;

public class eMpleH {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));

        Square[][] board = new Square[8][8];

        for(int r = 0; r < board.length; r++)
            for (int c = 0; c < board.length; c++)
                board[r][c] = new Square('x', r, c, true);

        String white = nya.readLine();
        String black = nya.readLine();

        if (!white.equals("White: "))
            Arrays.stream(white.replace("White: ", "").split(",")).map(x -> new Square(x, true)).forEach(x -> board[x.r][x.c] = x);
        if (!black.equals("Black: "))
            Arrays.stream(black.replace("Black: ", "").split(",")).map(x -> new Square(x, false)).forEach(x -> board[x.r][x.c] = x);

        System.out.println("+---+---+---+---+---+---+---+---+");
        for(Square[] x : board) {
            System.out.println(Arrays.toString(x).replaceAll("[\\[\\]]|, ", "|"));
            System.out.println("+---+---+---+---+---+---+---+---+");
        }

    }    
    
    
    static class Square implements Comparable<Square> {
        private static final int[] rows = {8, 7, 6, 5, 4, 3, 2, 1};
        private static final char[] cols = "abcdefgh".toCharArray();
        boolean white;
        char piece;
        int r;
        int c;

        public Square(char _p, int _r, int _c, boolean whiteSide) {
            setVars(_p, _r, _c, whiteSide);
        }

        public Square(String loc, boolean whiteSide) {
            if(loc.length() < 3)
                loc = "p" + loc;
            setVars(loc.charAt(0), rows.length - (loc.charAt(2) - 48), loc.charAt(1) - 97, whiteSide);
        }

        private void setVars(char _p, int _r, int _c, boolean whiteSide) {
            r = _r;
            c =_c;
            white = (r + c) % 2 == 0;
            if(_p == 'x')
                piece = white ? '.' : ':';
            else
                piece = whiteSide ? Character.toUpperCase(_p) : Character.toLowerCase(_p);
        }

        public boolean onBoard() {
            return r > -1 && r < 8 && c > -1 && c < 8;
        }

        @Override
        public int compareTo(Square o) {
            return r != o.r ? Integer.compare(r, o.r) : Integer.compare(c, o.c);
        }

        @Override
        public String toString() {
            return String.format((white ? ".%c." : ":%c:"), piece);
        }
    }
}
