import java.util.ArrayList;

import static com.rluisb.application.StringSplitter.splitString;

/*
Write a Java program to divide a string in n equal parts.
The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are:

abcde
fghij
klmno
pqrst
uvwxy
*/

public class Main {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy"; //length 25
        int split_number = 5;
        System.out.println("\n\n");
        splitString(str, split_number, new ArrayList<>()).forEach(System.out::println);

        str = "abcfdefghijkl"; //length 13
        split_number = 3;
        System.out.println("\n\n");
        splitString(str, split_number, new ArrayList<>()).forEach(System.out::println);

        str = "abcfdefghi"; //length 10
        split_number = 2;
        System.out.println("\n\n");
        splitString(str, split_number, new ArrayList<>()).forEach(System.out::println);
    }
}
