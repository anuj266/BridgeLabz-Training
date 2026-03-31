// program to check for the natural number and write the sum of n natural numbers 
package control_flow;
import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        if(number > 0) {
            sum = (number * (number + 1)) / 2;
            System.out.println("The sum of " + number + " natural numbers is: " + sum);
        } else {
            System.out.println("The number "+number + " is not a natural number.");
        }
        input.close();

    }
}
