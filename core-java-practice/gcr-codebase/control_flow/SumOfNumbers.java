// program to find the sum of numbers until the user enters 0
package control_flow;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        while(number != 0){
            number = sc.nextFloat();
            sum += number;

        }
        System.out.println(sum);
        sc.close();
    }
}
