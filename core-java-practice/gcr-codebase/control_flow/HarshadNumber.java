// Program to check if a number taken from the user is a Harshad Number.
package control_flow;
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int originalNumber = number;

        // Calculate the sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber /= 10;
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }

        sc.close();
    }
}
