// program "NaturalNumberSum" with the for loop instead of a while loop to find the sum of n Natural Numbers. 
package control_flow;
import java.util.Scanner;
public class NaturalNumberSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        // Using the formula n*(n+1)/2
        sum2 = (n * (n + 1)) / 2;
        // Using for loop
        for(int i = 1; i <= n; i++) {
            sum1 += i;
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
