import java.util.*;
        import java.io.*;

public class ProvincesAndGold {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int sum = nya.nextInt() * 3 + nya.nextInt() * 2 + nya.nextInt();

        if(sum >= 8)
            System.out.print("Province or ");
        else if(sum >= 5)
            System.out.print("Duchy or ");
        else if(sum >= 2)
            System.out.print("Estate or ");

        if(sum >= 6)
            System.out.println("Gold");
        else if(sum >= 3)
            System.out.println("Silver");
        else
            System.out.println("Copper");
    }
}
