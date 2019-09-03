import java.util.*;
import java.io.*;

public class NickProb {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int cats = Integer.parseInt(nya.nextLine());
        while(cats-->0){
            TreeMap<String, String> meow = new TreeMap<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String[] temp1 = o1.split(" ");
                    String[] temp2 = o2.split(" ");
                    double a = Double.parseDouble(temp1[1]);
                    double b = Double.parseDouble(temp2[1]);
                    if(a > b)
                        return 1;
                    else if(a < b)
                        return -1;
                    else
                        return temp1[0].compareTo(temp2[0]);
                }
            });
            int catss = Integer.parseInt(nya.nextLine());
            while(catss-->0){
                String temp = nya.nextLine();
                meow.put(temp, temp.split(" ")[0]);
            }
            for(String x: meow.values())
                System.out.println(x);
        }
    }
}
