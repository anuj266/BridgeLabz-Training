import java.util.*;

public class MarkAndToys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> prices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            prices.add(sc.nextInt());
        }
        int result = maximumToys(prices, k);
        System.out.println(result);
        sc.close();
    }

    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        int count = 0;
        int sum = 0;
        for (int p : prices) {
            if (sum + p <= k) {
                sum += p;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}