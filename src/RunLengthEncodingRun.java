import java.util.*;
import java.io.*;

public class RunLengthEncodingRun {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        switch(nya.next().charAt(0)){
            case 'E':
                String temp = nya.next();
                char cur = temp.charAt(0);
                int count = 1;
                for (int i = 1; i < temp.length(); i++) {
                    if(cur == temp.charAt(i))
                        count++;
                    else{
                        System.out.printf("%c%d", cur, count);
                        cur = temp.charAt(i);
                        count = 1;
                    }
                }
                System.out.printf("%c%d", cur, count);
                break;
            case 'D':
                temp = nya.next();
                for (int i = 0; i < temp.length(); i+=2) {
                    System.out.print(Character.toString(temp.charAt(i)).repeat(temp.charAt(i+1)-48));
                }
                break;
        }

    }
}
