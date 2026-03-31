// Write a program to check if the first number is the smallest among three numbers.
package control_flow;
import java.util.Scanner;

public class IsSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.print("Is the first number the smallest? ");
        if(num1<=num2 && num1<=num3){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
