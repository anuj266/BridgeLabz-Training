// program to find the power of a number using a while loop.
package control_flow;
import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = 1;
        if (exponent >= 0) {
            int i = 1;
            while (i <= exponent) {
                result = result * base;
                i++;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
