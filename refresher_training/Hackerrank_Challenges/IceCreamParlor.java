import java.util.*;

public class IceCreamParlor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            List<Integer> result = icecreamParlor(m, arr);
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if (i != result.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int cost = arr.get(i);
            int complement = m - cost;
            if (map.containsKey(complement)) {
                return Arrays.asList(map.get(complement), i + 1);
            }
            map.put(arr.get(i), i + 1);
        }
        return new ArrayList<>();
    }
}