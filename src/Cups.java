import java.util.*;
import java.io.*;

public class Cups {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = Integer.parseInt(nya.nextLine());

        TreeMap<Integer,String> meow = new TreeMap<>();

        while(cats-->0) {
            String[] mew = nya.nextLine().split(" ");
            try{
                meow.put(Integer.parseInt(mew[1]),mew[0]);
            } catch(Exception e) {
                meow.put(Integer.parseInt(mew[0])/2,mew[1]);
            }
        }
        for(String mew:meow.values())
            System.out.println(mew);
    }
}
