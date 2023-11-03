import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HidingPlaces {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
//        for(char x: "abcdefgh".toCharArray())
//            for(int y: IntStream.range(1, 9).toArray())
//                System.out.printf("%c%d\n", x, y);
        int mews = Integer.parseInt(nya.readLine());

        while(mews-->0) {
            int spaces = 0;
            TreeSet<Square> visited = new TreeSet<>();
            ArrayList<Square> cur = new ArrayList<>(), next = new ArrayList<>();
            next.add(new Square(nya.readLine(), 0));

            int[][] board = new int[8][8];

            do {
                cur.clear();
                cur.addAll(next);
                next.clear();


                for(Square e: cur) {
                    visited.add(e);
                    for(Square x: e.knight())
                        if (visited.add(x)) {
                            next.add(x);
                        }
                }

                spaces++;
            } while(!next.isEmpty());
            System.out.printf("%d %s\n", spaces - 1, cur.stream().sorted().map(Square::toString).collect(Collectors.joining(" ")));
        }
    }

    public static int knight(int[][] board, int r, int c) {
        LinkedList<Square> mew = new LinkedList<>();
        mew.add(new Square(r, c, 0));

        while(!mew.isEmpty()) {
            Square temp = mew.poll();

            if(board[temp.r][temp.c] != -1) {
                board[temp.r][temp.c] = 0;

            }
        }
        return 0;
    }

    static class Square implements Comparable<Square>{
        private final int[] rows = {8, 7, 6, 5, 4, 3, 2, 1};
        private final char[] cols = "abcdefgh".toCharArray();
        int moves;
        int r;
        int c;

        public Square(int _r, int _c, int m) {
            r = _r;
            c =_c;
            moves = m;
        }

        public Square(String loc, int m) {
            r = rows.length - (loc.charAt(1) - 48);
            c = loc.charAt(0) - 97;
            moves = m;
        }

        public boolean onBoard() {
            return r > -1 && r < 8 && c > -1 && c < 8;
        }

        public ArrayList<Square> knight() {
            ArrayList<Square> output = new ArrayList<>();
            output.add(new Square(r - 2, c - 1, moves + 1));
            output.add(new Square(r - 2, c + 1, moves + 1));
            output.add(new Square(r - 1, c - 2, moves + 1));
            output.add(new Square(r - 1, c + 2, moves + 1));
            output.add(new Square(r + 1, c - 2, moves + 1));
            output.add(new Square(r + 1, c + 2, moves + 1));
            output.add(new Square(r + 2, c - 1, moves + 1));
            output.add(new Square(r + 2, c + 1, moves + 1));
            output.removeIf(x -> !x.onBoard());
            return output;
        }

        @Override
        public int compareTo(Square o) {
            return r != o.r ? Integer.compare(r, o.r) : Integer.compare(c, o.c);
        }

        @Override
        public String toString() {
            return String.format("%c%d", cols[c], rows[r]);
        }
    }
}

/*

8 .  .  .  .  .  .  .  .
7 .  .  .  .  .  .  .  .
6 .  .  .  .  .  .  .  .
5 .  .  .  .  .  .  .  .
4 .  .  .  .  .  .  .  .
3 .  x  .  .  .  .  .  .
2 .  .  x  .  .  .  .  .
1 x  .  .  .  .  .  .  .
  a  b  c  d  e  f  g  h

64
a1
a2
a3
a4
a5
a6
a7
a8
b1
b2
b3
b4
b5
b6
b7
b8
c1
c2
c3
c4
c5
c6
c7
c8
d1
d2
d3
d4
d5
d6
d7
d8
e1
e2
e3
e4
e5
e6
e7
e8
f1
f2
f3
f4
f5
f6
f7
f8
g1
g2
g3
g4
g5
g6
g7
g8
h1
h2
h3
h4
h5
h6
h7
h8


 */