// program to find all the multiples of a number below 100 using while loop
package control_flow;
import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            int i = 1;
            while (i * number < 100) {
                System.out.println(i * number);
                i++;
            }
        }
        sc.close();
    }
}
