/* problem statement: 
        Given an array of strings sorted in lexicographical order, print all of its permutations in 
        strict lexicographical order. If two permutations look the same, only print one of them.
*/

import java.util.*;

public class PermutationOfString {

    public static boolean next_permutation(List<String> a) {

        int i = a.size() - 2;

        // Find the rightmost index a[i] < a[i + 1]
        while (i >= 0 && a.get(i).compareTo(a.get(i + 1)) >= 0) {
            i--;
        }
       
        if (i < 0) {
            return false;
        }

        // Find the rightmost element
        // greater than a[i]
        int j = a.size() - 1;

        while (a.get(j).compareTo(a.get(i)) <= 0) {
            j--;
        }

        // Swap a[i] and a[j]
        String temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);

        // Reverse everything after i
        int left = i + 1;
        int right = a.size() - 1;

        while (left < right) {
            temp = a.get(left);
            a.set(left, a.get(right));
            a.set(right, temp);

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }
    
        do {
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(s.get(i));
            }
            System.out.println();
        } while (next_permutation(s));

        sc.close();
    }
}