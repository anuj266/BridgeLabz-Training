import java.util.*;

public class DavisStaircase {

    static int[] memo;

    public static int stepPerms(int n) {
        if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        if(memo[n] != 0)
            return memo[n];
        memo[n] = stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while (s-- > 0) {
            int n = sc.nextInt();
            memo = new int[n + 1];
            int result = stepPerms(n);
            System.out.println(result);
        }
        sc.close();
    }
}