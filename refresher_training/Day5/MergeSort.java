import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            long result = countInversions(arr);
            System.out.println(result);
        }
        sc.close();
    }

    public static long countInversions(List<Integer> arr) {
        return mergeSort(arr, 0, arr.size() - 1);
    }

    public static long mergeSort(List<Integer> arr, int left, int right) {
        long count = 0;
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;
        count += mergeSort(arr, left, mid);
        count += mergeSort(arr, mid + 1, right);
        count += merge(arr, left, mid, right);
        return count;
    }

    public static long merge(List<Integer> arr, int left, int mid, int right) {
        List<Integer> temp = new ArrayList<>();
        int i = left;
        int j = mid + 1;
        long count = 0;
        while (i <= mid && j <= right) {
            if (arr.get(i) <= arr.get(j)) {
                temp.add(arr.get(i++));
            } else {
                temp.add(arr.get(j++));

                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp.add(arr.get(i++));
        }

        while (j <= right) {
            temp.add(arr.get(j++));
        }

        for (int k = left; k <= right; k++) {
            arr.set(k, temp.get(k - left));
        }

        return count;
    }
}