/*
    problem statement: 
    Given two arrays of integers, find which elements in the second array are missing
    from the first array.
*/

import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int m = sc.nextInt();
        List<Integer> brr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            brr.add(sc.nextInt());
        }
        List<Integer> result = missingNumbers(arr, brr);
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        HashSet<Integer> set = new HashSet<>();

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i : arr) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }

        for (int i : brr) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }

        for (int key : map2.keySet()) {
            int val1 = map1.getOrDefault(key, 0);
            int val2 = map2.get(key);
            if (val1 != val2) {
                set.add(key);
            }
        }

        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }
}