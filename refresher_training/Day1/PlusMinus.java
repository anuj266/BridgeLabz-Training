import java.util.*;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        float pos = 0f, neg = 0f, zero = 0f;
        for (int num : arr) {
            if (num == 0) {
                zero++;
            } else if (num > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f", pos / n, neg / n, zero / n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        plusMinus(arr);
        sc.close();
    }

}