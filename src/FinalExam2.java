import java.util.*;
import java.io.*;

public class FinalExam2 {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int grade = 0;
        int ans = 0;
        for(int mews = Integer.parseInt(nya.readLine()); mews > 0; mews--){
            int temp = nya.read();
            ans += grade == temp ? 1 : 0;
            grade = temp;
            nya.skip(1);
        }
        System.out.println(ans);
    }
}
