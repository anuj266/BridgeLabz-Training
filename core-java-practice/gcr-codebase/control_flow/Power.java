// program to find the power of a number.
package control_flow;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if (power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
