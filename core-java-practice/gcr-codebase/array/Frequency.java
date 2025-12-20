// A program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
package array;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNumber = number;
        int digitCount = 0;
        // Counting the number of digits
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }
        int[] digits = new int[digitCount];
        // Storing digits in the array
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        // Finding frequency of each digit
        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }
        // Displaying the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
        sc.close();
    }
}
