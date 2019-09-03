import java.util.*;
import java.io.*;

public class LastFactorialDigit {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = nya.nextInt();
        for (int i = 0; i < cats; i++) {
            int temp = nya.nextInt();
            switch(temp){
                case 1: System.out.println("1");break;
                case 2: System.out.println("2");break;
                case 3: System.out.println("6");break;
                case 4: System.out.println("4");break;
                default: System.out.println("0");break;
            }
        }
    }
}
