/*
    problem statement:
    Given two strings, determine if they share a common substring. 
    A substring may be as small as one character.
*/

import java.util.*;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        sc.close();
    }

    public static String twoStrings(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        boolean[] arr = new boolean[26];

        for (char c : s1.toCharArray()) {
            arr[c - 'a'] = true;
        }

        for (char c : s2.toCharArray()) {
            if (arr[c - 'a']) {
                return "YES";
            }
        }

        return "NO";
    }
}