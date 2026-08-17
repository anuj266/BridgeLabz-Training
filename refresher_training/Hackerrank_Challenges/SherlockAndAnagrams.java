/*
    problem statement: 
     Given a string, find the number of pairs of substrings of the string that are anagrams of 
     each other.
*/

import java.util.*;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String s = sc.nextLine();
            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
        sc.close();
    }

    public static int sherlockAndAnagrams(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j + i <= n; j++) {
                int[] freq = new int[26];
                for (int k = j; k < j + i; k++) {
                    freq[s.charAt(k) - 'a']++;
                }
                String key = Arrays.toString(freq);
                count += map.getOrDefault(key, 0);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        return count;
    }
}