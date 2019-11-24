import java.util.*;
import java.io.*;

public class SynchronizingLists {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        while(nya.hasNext()){
            int size = nya.nextInt();
            if(size == 0) break;
            TreeSet<Integer> meow = new TreeSet();
            TreeSet<Integer> mew = new TreeSet();
            ArrayList<Integer> order = new ArrayList<Integer>();
            HashMap<Integer,Integer> coolstuff = new HashMap();

            for (int i = 0; i < size; i++) {
                int temp = nya.nextInt();
                meow.add(temp);
                order.add(temp);
            }

            for (int i = 0; i < size; i++)
                mew.add(nya.nextInt());

            Iterator<Integer> _meow = meow.iterator();
            Iterator<Integer> _mew = mew.iterator();

            for (int i = 0; i < size; i++) {
                coolstuff.put(_meow.next(),_mew.next());
            }

            for(int i: order)
                System.out.println(coolstuff.get(i));

        }
    }
}
