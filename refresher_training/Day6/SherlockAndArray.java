import java.util.*;

public class SherlockAndArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println(balancedSums(arr));
        }
        sc.close();
    }

    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (leftSum == totalSum - leftSum - arr.get(i)) {
                return "YES";
            }
            leftSum += arr.get(i);
        }
        return "NO";
    }
}