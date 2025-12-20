// program to find all the multiples of a number taken as user input below 100.
package control_flow;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            for (int i = 1; i * number < 100; i++) {
                System.out.println(i * number);
            }
        }
        sc.close();
    }
}
