import java.util.*;

public class InsertionSortTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int result = runningTime(arr);
        System.out.println(result);
        sc.close();
    }

    public static int runningTime(List<Integer> arr) {
        int n = arr.size();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && key < arr.get(j)) {
                arr.set(j + 1, arr.get(j));
                count++;
                j--;
            }
            arr.set(j + 1, key);
        }
        return count;
    }
}