import java.util.*;
import java.io.*;

public class Patuljci {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList();

        int mew = 0;

        for(int i = 0; i < 9; i++){
            nums.add(Integer.parseInt(nya.nextLine()));
            mew += nums.get(nums.size()-1);
        }

        mew -= 100;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) == mew){
                    nums.remove(i);
                    nums.remove(j-1);
                }
            }
        }

        for(int x: nums)
            System.out.println(x);
    }
}
