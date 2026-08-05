import java.util.*;

public class Primality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(primality(n));
        }
        sc.close();
    }

    public static String primality(int n) {
        if (n == 2 || n == 3)
            return "Prime";
        if (n % 2 == 0 || n <= 1)
            return "Not prime";
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return "Not prime";
        }
        return "Prime";
    }
}