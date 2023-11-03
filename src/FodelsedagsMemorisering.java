import java.util.*;
import java.io.*;

public class FodelsedagsMemorisering {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Person> ans = new HashMap<>();

        int mew = Integer.parseInt(nya.readLine());

        for(;mew-->0;){
            String[] temp = nya.readLine().split(" ");
            Person jeroo = new Person(temp);
            if(!ans.containsKey(temp[2]))
                ans.put(temp[2], jeroo);
            else if(jeroo.compareTo(ans.get(temp[2])) > 0)
                ans.put(temp[2], jeroo);
        }

        System.out.println(ans.values().size());
        ans.values().stream().map(x -> x.name).sorted().forEach(System.out::println);
    }

    static class Person implements Comparable<Person> {
        public String name;
        public int like;
        Person(String[] data){
            name = data[0];
            like = Integer.parseInt(data[1]);
        }

        public int compareTo(Person other) {
            return Integer.compare(like, other.like);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
