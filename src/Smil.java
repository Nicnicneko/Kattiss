import java.util.*;
import java.io.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Smil {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println(Pattern.compile("[;:]-?\\)").matcher(nya.readLine()).results().map(x -> Integer.toString(x.start())).collect(Collectors.joining("\n")));
        String data = nya.readLine();

        for(int i = 0; i < data.length(); i++){
            if(data.regionMatches(i, ":)", 0, 2))
                System.out.println(i);
            if(data.regionMatches(i, ";)", 0, 2))
                System.out.println(i);
            if(data.regionMatches(i, ":-)", 0, 3))
                System.out.println(i);
            if(data.regionMatches(i, ";-)", 0, 3))
                System.out.println(i);
        }
    }
}
