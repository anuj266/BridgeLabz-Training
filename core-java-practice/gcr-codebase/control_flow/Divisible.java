// Write a program to check if a number is divisible by 5 or not.
package control_flow;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println(number + " is not divisible by 5");
        }
        sc.close();
    }
}
