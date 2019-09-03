import java.util.*;
import java.io.*;

public class ANewAlphabet {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        HashMap<Character, String> dict = new HashMap();

        dict.put('a',"@");
        dict.put('b',"8");
        dict.put('c',"(");
        dict.put('d',"|)");
        dict.put('e',"3");
        dict.put('f',"#");
        dict.put('g',"6");
        dict.put('h',"[-]");
        dict.put('i',"|");
        dict.put('j',"_|");
        dict.put('k',"|<");
        dict.put('l',"1");
        dict.put('m',"[]\\/[]");
        dict.put('n',"[]\\[]");
        dict.put('o',"0");
        dict.put('p',"|D");
        dict.put('q',"(,)");
        dict.put('r',"|Z");
        dict.put('s',"$");
        dict.put('t',"']['");
        dict.put('u',"|_|");
        dict.put('v',"\\/");
        dict.put('w',"\\/\\/");
        dict.put('x',"}{");
        dict.put('y',"`/");
        dict.put('z',"2");

        String norm = nya.nextLine();
        String cool = "";

        for (int i = 0; i < norm.length(); i++) {
            char temp = norm.charAt(i);
            if(temp > 64 && temp < 91 || temp > 96 && temp < 123)
                cool += dict.get(Character.toLowerCase(temp));
            else
                cool += temp;
        }

        System.out.println(cool);

    }
}
