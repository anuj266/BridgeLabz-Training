import java.util.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        List<Integer> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(sc.nextInt());
        }
        List<Integer> result = circularArrayRotation(a, k, queries);

        for (int num : result) {
            System.out.println(num);
        }

        sc.close();
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        int n = a.size();
        k = k % n;
        List<Integer> rotatedArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rotatedArray.add(a.get((i - k + n) % n));
        }
        List<Integer> result = new ArrayList<>();
        for (int idx : queries) {
            result.add(rotatedArray.get(idx));
        }
        return result;
    }
}