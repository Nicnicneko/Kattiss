import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        while(nya.hasNext()){
            Scanner mew = new Scanner(nya.nextLine());

            while(mew.hasNext()) {
                String temp = mew.next();
                Matcher m = Pattern.compile("([^aeiouy]\\w*?)([aeiouy].*)").matcher(temp);
                System.out.print(m.matches() ? m.group(2) + m.group(1) + "ay " : temp + "yay ");
            }
            System.out.println();
        }
    }
}
