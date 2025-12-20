// A program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 
package array;
import java.util.Scanner;
public class MarksOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3]; // 0: physics, 1: chemistry, 2: maths
        double[] percentages = new double[n];
        String[] grades = new String[n];
        // Taking input for marks
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                double mark;
                do {
                    if (j == 0) System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
                    else if (j == 1) System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
                    else System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
                    mark = sc.nextDouble();
                    if (mark < 0) {
                        System.out.println("Please enter a positive value for marks.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }
        }
        // Calculating percentages and grades
        for (int i = 0; i < n; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (totalMarks / 300) * 100;
            percentages[i] = percentage;
            if (percentage >= 90) {
                grades[i] = "A";
            } else if (percentage >= 80) {
                grades[i] = "B";
            } else if (percentage >= 70) {
                grades[i] = "C";
            } else if (percentage >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        // Displaying the results
        System.out.printf("%-10s %-10s %-10s %-15s %-10s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15.2f %-10s%n", marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
