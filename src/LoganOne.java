import java.util.*;

public class LoganOne
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r = Integer.valueOf(scan.nextLine());
        while(r-->0)
        {
            TreeMap<Double, ArrayList<String>> multi = new TreeMap();
            int i = Integer.valueOf(scan.nextLine());
            for(int j = 0; j < i; j++)
            {
                String [] arr = scan.nextLine().split(" ");
                double k = Double.valueOf(arr[1]);
                if(multi.containsKey(k))
                {
                    multi.get(k).add(arr[0]);
                    Collections.sort(multi.get(k));
                }
                else
                {
                    ArrayList<String> tem = new ArrayList<String>();
                    tem.add(arr[0]);
                    multi.put(k, tem);
                }
            }
            for(double d: multi.keySet())
            {
                for(String s : multi.get(d))
                {
                    System.out.println(s);
                }
            }
        }
    }
}