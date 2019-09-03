//Unfinished

import java.util.*;
import java.io.*;

public class Dreamer {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(new File("test.in"));

        int times = Integer.parseInt(nya.nextLine());

        while(times-->0){
            ArrayList<String> nums = new ArrayList<>(Arrays.asList(nya.nextLine().replaceAll(" ","").split("")));
            //System.out.println(nums);
            Set<String> pls = combo(nums, new HashSet<String>(), "");

            GregorianCalendar early = new GregorianCalendar(9999,12,31);

            for(String s: pls){
                GregorianCalendar temp = new GregorianCalendar(Integer.parseInt(s.substring(4,8)) , Integer.parseInt(s.substring(2,4)), Integer.parseInt(s.substring(0,2)));
                if(temp.compareTo(early) < 0)
                    early = temp;

            }
            if(pls.size() == 0)
                System.out.println("0");
            else
                System.out.printf("%d %s %s %d\n",pls.size(),early.get(5) < 10 ? "0"+early.get(5) : early.get(5),early.get(2) < 10 ? "0"+early.get(2) : early.get(2) ,early.get(1));
        }

    }

    static Set<String> combo(ArrayList<String> a, Set<String> c, String b){
        //System.out.printf("%d\n",c.size());
        if(b.length() > 0){
            switch(b.length()){
                case 1:
                    if(b.charAt(0) > '3')
                        return c;
                    break;
                case 2:
                    if(b.charAt(0) == '0' && b.charAt(1) == '0')
                        return c;
                    break;
                case 3:
                    if(b.charAt(2) > '1')
                        return c;
                    break;
                case 4:
                    if( (b.charAt(2) == '0' && b.charAt(3) == '0') || (b.charAt(2) == '1' && b.charAt(3) > '2') )
                        return c;
                    String mon = b.substring(2,4);
                    switch(b.substring(0,2)){
                        case "30":
                            if(mon.matches("02"))
                                return c;
                            break;
                        case "31":
                            if(!mon.matches("01|03|05|07|08|10|12"))
                                return c;
                            break;
                    }
                    break;
                case 5:
                    if(b.charAt(4) < '2')
                        return c;
                    break;
                case 8:
                    int year = Integer.parseInt(b.substring(4,8));
                    if(b.substring(0,4).equals("2902") && (year%4 != 0 || year%100 == 0 && year%400 != 0))
                        return c;
                    break;
            }
        }
        if(a.size() == 0)
            c.add(b);
        else{
            for(int i = 0; i < a.size();i++){
                String temp = a.remove(i);
                c.addAll(combo(a,c,b+temp));
                a.add(i,temp);
            }
        }
        return c;
    }

}

