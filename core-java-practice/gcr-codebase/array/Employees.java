// A program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.

package array;
import java.util.Scanner;
public class Employees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        // Taking user input for salaries and years of service
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            double salary = sc.nextDouble();
            if (salary < 0) {
                System.out.println("Invalid salary. Please enter again.");
                i--;
                continue;
            }
            salaries[i] = salary;
            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
            double years = sc.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service. Please enter again.");
                i--;
                continue;
            }
            yearsOfService[i] = years;
        }
        // Calculating bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * 0.05;
            } else {
                bonus = salaries[i] * 0.02;
            }
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        // Printing total bonus, old salary, and new salary
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total new salary of all employees: " + totalNewSalary);
        sc.close();
    }
}
