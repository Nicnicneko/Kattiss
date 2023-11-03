import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Timebomb {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> digits = new HashMap<>();
        digits.put("**** ** ** *", "0");
        digits.put("  *  *  *  *", "1");
        digits.put("***  *****  ", "2");
        digits.put("***  ****  *", "3");
        digits.put("* ** ****  *", "4");
        digits.put("****  ***  *", "5");
        digits.put("****  **** *", "6");
        digits.put("***  *  *  *", "7");
        digits.put("**** ***** *", "8");
        digits.put("**** ****  *", "9");

        String temp = nya.readLine();

        String[] mew = new String[(temp.length() + 1) / 4];
        Arrays.fill(mew, "");

        int times = 4;

        while (times-- > 0) {
            for (int i = 0; i < (temp.length() + 1) / 4; i++) {
                mew[i] += temp.substring(i * 4, (i + 1) * 4 - 1);
            }
            temp = nya.readLine();
        }

        String ans = "";

        for(String x: mew) {
            if(!digits.containsKey(x)) {
                System.out.println("BOOM!!");
                return;
            }
            ans += digits.get(x);
        }

        System.out.println(Integer.parseInt(ans) % 6 == 0 ? "BEER!!" : "BOOM!!");
    }
}

/*
0 1 2 3 4 5 6 7 8 9
-------------------
1 2 1 1 3 1 1 1 1 1
1 2 2 2 1 3 3 2 1 1
1 2 3 3 3 3 3 2 3 3
1 2 3 2 2 2 1 2 1 2
1 2 1 1 2 1 1 2 1 1

1 2 1 1 3 1 1 1 1 1 //1
1 2 2 2 1 3 3 2 1 1 //2
1 2 3 3 3 3 3 2 3 3 //3
1 2 3 2 2 2 1 2 1 2 //4

0   1   2   3   4   5   6   7   8   9
---------------------------------------
12  5   11  11  9   11  12  7   13  12  //total
3   1   3   3   2   3   3   3   3   3   //1
2   1   1   1   2   1   1   1   2   2   //2
2   1   3   3


 */