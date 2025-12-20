// An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
package array;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];
        // Taking input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        // Calculating BMI and determining weight status
        for (int i = 0; i < n; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        // Displaying the results
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s%n", heights[i], weights[i], bmis[i], statuses[i]);
        }
        sc.close();
    }
}
