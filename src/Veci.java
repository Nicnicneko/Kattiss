import java.util.*;
import java.io.*;

public class Veci {
    static ArrayList<Integer> cool = new ArrayList();
    static int target;

    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        StringBuilder ori = new StringBuilder(nya.nextLine());
        target = Integer.parseInt(ori.toString());
        gen("", ori);
        Collections.sort(cool);
        System.out.println(cool.size()==0?0:cool.get(0));
    }

    private static void gen(String cur, StringBuilder ops){
        if(ops.length() == 0) {
            if (Integer.parseInt(cur) > target)
                cool.add(Integer.parseInt(cur));
        }
        else{
            for (int i = 0; i < ops.length(); i++) {
                StringBuilder temp = new StringBuilder(ops.toString());
                gen(cur + ops.charAt(i), temp.deleteCharAt(i));
            }
        }
    }
}
