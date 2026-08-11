import java.util.*;

public class InsertionSortPartOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        insertionSort1(n, arr);
        sc.close();
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        int num = arr.get(n - 1);
        int i = n - 2;
        while (i >= 0 && num < arr.get(i)) {
            arr.set(i + 1, arr.get(i));
            for (int j = 0; j < n; j++) {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
            i--;
        }
        arr.set(i + 1, num);
        for (int j = 0; j < n; j++) {
            System.out.print(arr.get(j) + " ");
        }
    }
}