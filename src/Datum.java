import java.util.*;
import java.io.*;

public class Datum {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int day = nya.nextInt();
        int month = nya.nextInt();
        GregorianCalendar cat = new GregorianCalendar();
        cat.clear();
        cat.set(2008,month,day);

        switch((cat.get(Calendar.DAY_OF_WEEK)+5)%7+1){
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;
            case 7: System.out.println("Saturday");break;
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
        }
    }
}
