import java.util.*;
import java.io.*;

public class WhatDoesTheFoxSay {
    public static void main(String[] args) throws IOException {
        Scanner nya = new Scanner(System.in);

        int mew = Integer.parseInt(nya.nextLine());

        for (int i = 0; i < mew; i++) {

            String fox = nya.nextLine();

            for (String temp = nya.nextLine(); !temp.equals("what does the fox say?"); temp = nya.nextLine()) {
                fox = fox.replaceAll("(?<![A-Za-z])" + temp.replaceAll(".*goes ", "") + "(?![A-Za-z])", "");
            }

            System.out.println(fox.replaceAll(" {2,}", " ").strip());
        }
    }
}
