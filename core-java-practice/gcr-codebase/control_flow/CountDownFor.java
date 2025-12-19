// Program to count down the number from the user input value to 1 using a for loop for a rocket launch
package control_flow;
import java.util.Scanner;
public class CountDownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
