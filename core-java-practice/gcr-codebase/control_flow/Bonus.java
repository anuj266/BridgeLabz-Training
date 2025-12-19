// Create a program to find the bonus of employees based on their years of service.
package control_flow;
import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int yearsOfService = sc.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus");
        }
        sc.close();
    }
}
