//program to count down the number from the user input value to 1 using a while loop for a rocket launch
package control_flow;
import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
        sc.close();
        
    }
}
