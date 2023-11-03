import java.util.*;
import java.io.*;

public class Coconut {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        int syl = nya.nextInt(), ply = nya.nextInt(), j = 0;

        ArrayList<String> peeps = new ArrayList<>();

        for (int i = 0; i < ply; i++) {
            peeps.add(i + " " + 3);
        }

        while(peeps.size() > 1){
//            System.out.println(peeps);
            j = (j + syl - 1) % peeps.size();
//            System.out.println(j);
            String temp = peeps.remove(j);

            switch(temp.charAt(temp.length()-1)){
                case '3':
                    peeps.add(j, temp.split(" ")[0] + " " + 2);
                    peeps.add(j, temp.split(" ")[0] + " " + 2);
                    break;
                case '2':
                    peeps.add(j, temp.split(" ")[0] + " " + 1);
                    j = (j + 1) % peeps.size();
                    break;
                case '1':
                    j = (j) % peeps.size();
                    break;
            }
        }
        System.out.println(Integer.parseInt(peeps.get(0).split(" ")[0]) + 1);
    }
}
