// program to count the number of digits in an integer.
package control_flow;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;      // Increase count by 1
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
