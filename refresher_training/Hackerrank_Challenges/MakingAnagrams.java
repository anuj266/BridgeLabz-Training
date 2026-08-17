import java.util.*;

public class MakingAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int result = makeAnagram(a, b);
        System.out.println(result);
        sc.close();
    }

    public static int makeAnagram(String a, String b) {

        int[] arr = new int[26];
        int count = 0;
        for (char c : a.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            arr[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] < 0 || arr[i] > 0) {
                count += Math.abs(arr[i]);
            }
        }
        return count;
    }
}