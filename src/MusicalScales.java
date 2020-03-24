/*
 * Hi good luck bud!
 *
 */

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class MusicalScales {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);
        String[] notes = {"A", "A#", "B", "C", "C#", "D","D#", "E", "F", "F#", "G", "G#"};

        TreeMap<String, TreeSet<String>> scales = new TreeMap();

        for (int i = 0; i < notes.length; i++) {
            TreeSet<String> temp = new TreeSet();
            temp.add(notes[(i) % 12]);
            temp.add(notes[(2 + i) % 12]);
            temp.add(notes[(4 + i) % 12]);
            temp.add(notes[(5 + i) % 12]);
            temp.add(notes[(7 + i) % 12]);
            temp.add(notes[(9 + i) % 12]);
            temp.add(notes[(11 + i) % 12]);

            scales.put(notes[i], temp);
        }

        nya.nextLine();

        HashSet<String> temp = Arrays.stream(nya.nextLine().split(" ")).collect(Collectors.toCollection(HashSet::new));

        boolean printed = true;

        for(String x: scales.keySet())
            if(scales.get(x).containsAll(temp)){
                System.out.print(x + " ");
                printed = false;
            }

        System.out.print(printed ? "none\n" : "\n");

    }
}
