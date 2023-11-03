import java.util.*;
import java.io.*;

public class Karte {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        String mew = nya.nextLine();
        HashSet<String> crd = new HashSet<>();
        int[] ans = new int[4];
        Arrays.fill(ans, 13);


        for (int i = 0; i < mew.length(); i+=3) {

            if(!crd.add(mew.substring(i, i+3))){
                System.out.println("GRESKA");
                return;
            }


            switch(mew.charAt(i)){
                case 'P':
                    ans[0]--;
                    break;
                case 'K':
                    ans[1]--;
                    break;
                case 'H':
                    ans[2]--;
                    break;
                case 'T':
                    ans[3]--;
                    break;
            }
        }

        System.out.println(Arrays.toString(ans).replaceAll("[\\[\\],]", ""));
    }
}
