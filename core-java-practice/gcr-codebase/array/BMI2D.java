// Program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
package array;
import java.util.Scanner;
public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3]; // 0: weight, 1: height, 2: BMI
        String[] weightStatus = new String[n];
        // Taking input for weight and height
        for (int i = 0; i < n; i++) {
            double weight;
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight < 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight < 0);
            personData[i][0] = weight;

            double height;
            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height < 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height < 0);
            personData[i][1] = height;
        }
        // Calculating BMI and determining weight status
        for (int i = 0; i < n; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        // Displaying the results
        System.out.printf("%-10s %-10s %-10s %-20s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-20s%n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
    }
        sc.close();
    }
}
