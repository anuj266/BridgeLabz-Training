// program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
package control_flow;
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        // Using the formula n*(n+1)/2
        sum2 = (number * (number + 1)) / 2;
        // Using while loop
        while(number > 0) {
            sum1 += number;
            number--;
        }
        
        System.out.println("Sum using loop: " + sum1);
        System.out.println("Sum using formula: " + sum2);
        if(sum1 == sum2) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("There is a discrepancy between the two computations.");
        }
        sc.close();
    }
}
