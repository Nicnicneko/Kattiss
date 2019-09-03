import java.util.ArrayList;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner nya = new Scanner(System.in);
        ArrayList<Integer> stuff = new ArrayList<>(nya.nextInt());

        for(int x: stuff)
            stuff.add(nya.nextInt());

        ArrayList<ArrayList<Integer>> ms = new ArrayList<>();

        

    }

    public static boolean recur(ArrayList<Integer> x, int y, int z){

        if(y < x.get(z))
            return false;


        return true;
    }
}

