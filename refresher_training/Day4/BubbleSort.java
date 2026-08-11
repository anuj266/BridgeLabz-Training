import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        countSwaps(arr);
        sc.close();
    }

    public static void countSwaps(List<Integer> a) {
        int n = a.size();
        int swap = 0;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    swap++;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        System.out.println("Array is sorted in " + swap + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
    }
}