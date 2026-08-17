/*
    problem statement:
    You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] 
    without any duplicates. You are allowed to swap any two elements. 
    Find the minimum number of swaps required to sort the array in ascending order.
*/

import java.util.*;

public class MinimumSwap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = minimumSwaps(arr);
        System.out.println(result);
        sc.close();
    }

    public static int minimumSwaps(int[] arr) {

        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != i + 1) {
                int idx = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                swap++;
            }
        }
        return swap;
    }
}