import java.util.*;
import java.io.*;

public class ACM {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        HashSet<Character> right = new HashSet<>();
        HashMap<String, Integer> value = new HashMap<>();

        while(true){
            String[] stuff = nya.nextLine().split(" ");

            if(stuff[0].equals("-1"))
                break;

            if(stuff[2].equals("right"))
                right.add(stuff[1].charAt(0));

            if(!value.containsKey(stuff[1]))
                if(stuff[2].equals("right"))
                    value.put(stuff[1], Integer.parseInt(stuff[0]));
                else
                    value.put(stuff[1], 20);
            else
                if(stuff[2].equals("right"))
                    value.put(stuff[1], value.get(stuff[1]) + Integer.parseInt(stuff[0]));
                else
                    value.put(stuff[1], value.get(stuff[1]) + 20);
        }

        int sum = 0;

        for(char x: right)
            sum += value.get(Character.toString(x));

        System.out.printf("%d %d",right.size(),sum);
    }
}
