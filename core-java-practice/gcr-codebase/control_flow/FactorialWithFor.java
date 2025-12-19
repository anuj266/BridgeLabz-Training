// Program for factorial of a number using for loop
package control_flow;
import java.util.Scanner;

public class FactorialWithFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        sc.close();
    }
}
