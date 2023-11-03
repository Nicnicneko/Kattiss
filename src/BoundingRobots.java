import java.util.*;
import java.io.*;

public class BoundingRobots {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        for(int _x = 0, _y = 0, x = 0, y = 0 ;; _x = _y = x = y = 0){

            int w = nya.nextInt(), l = nya.nextInt();
            nya.nextLine();
            if(w == 0 && l == 0)
                return;

            int mew = Integer.parseInt(nya.nextLine());

            for (int i = 0; i < mew; i++) {
                char temp = nya.next().charAt(0);
                int mov = nya.nextInt();
                switch(temp){
                    case 'u':
                        _y += mov;
                        y += mov;
                        y = Math.min(y, l - 1);
                        break;
                    case 'd':
                        _y -= mov;
                        y -= mov;
                        y = Math.max(y, 0);
                        break;
                    case 'l':
                        _x -= mov;
                        x -= mov;
                        x = Math.max(x, 0);
                        break;
                    case 'r':
                        _x += mov;
                        x += mov;
                        x = Math.min(x, w - 1);
                        break;
                }
                nya.nextLine();
            }
            System.out.printf("Robot thinks %d %d\nActually at %d %d\n\n", _x, _y, x, y);

        }
    }
}
