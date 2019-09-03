//Time Limit Exceeded
import java.util.*;
import java.io.*;

public class Fenwick {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int n = nya.nextInt();
        int ops = nya.nextInt();
        nya.nextLine();

        FenTree cat = new FenTree(n);

        while(ops-->0) {
            String[] temp = nya.nextLine().split(" ");
            if(temp[0].equals("+"))
                cat.update(Integer.parseInt(temp[1]),Integer.parseInt(temp[2]));
            else
                System.out.println(cat.getSum(Integer.parseInt(temp[1])));
        }

    }
}

class FenTree {
    private int[] BITree;

    public FenTree(int n) {
        BITree = new int[n+1];
    }

    public FenTree(int[] arr) {
        BITree = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            update(i,arr[i]);
        }
    }

    public int getSum(int x) {
        //x++;
        int sum = 0;
        while(x > 0) {
            sum += BITree[x];
            x -= x & -x;
        }
        return sum;
    }

    public void update(int x, int val) {
        x++;
        while(x <= BITree.length-1) {
            BITree[x] += val;
            x += x & -x;
        }
    }
}
