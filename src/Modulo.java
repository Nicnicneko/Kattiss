import java.util.ArrayList;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner nya = new Scanner(System.in);
        ArrayList<Integer> stuff = new ArrayList<>();

        while(nya.hasNext()){

            int a = nya.nextInt();

            if(!stuff.contains(a % 42))
                stuff.add(a % 42);
        }
        System.out.println(stuff.size());
    }
}
