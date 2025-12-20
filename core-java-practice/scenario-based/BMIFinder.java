package scenrio_based;
import java.util.Scanner;
public class BMIFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100; // Convert height to meters
        double bmi = weight / (heightM * heightM); // BMI formula

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight.");
        } else {
            System.out.println("Overweight.");
        }

        sc.close();
    }
}
