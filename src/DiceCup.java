import java.util.*;
import java.io.*;

public class DiceCup {
    public static void main(String[] args) throws IOException{
        Scanner nya = new Scanner(System.in);
        int a = nya.nextInt();
        int b = nya.nextInt();
        ArrayList<Integer> c = new ArrayList();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                c.add(i+j);
            }
        }

        Collections.sort(c);

        int[] nums = new int[a+b-1];
        int max = -1;

        for(int i = 0; i < nums.length; i++){
            nums[i]= c.lastIndexOf(i+2) - c.indexOf(i+2)+1;
            max = Math.max(max,nums[i]);
        }


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == max)
                System.out.println(i+2);
        }
    }
}
