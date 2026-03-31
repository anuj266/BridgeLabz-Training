// A program to store the digits of the number in an array and find the largest and second largest element of the array.
package array;
import java.util.Scanner;
public class DigitsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        // Storing digits in the array
        while (number != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        // Finding largest and second largest digits
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        // Displaying the results
        if (largest != -1) {
            System.out.println("The largest digit is: " + largest);
        } else {
            System.out.println("No digits found.");
        }
        if (secondLargest != -1) {
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
        sc.close();
    }
}
