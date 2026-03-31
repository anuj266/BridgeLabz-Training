// LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
package control_flow;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        // Using multiple if-else statements
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year");
                    } else {
                        System.out.println(year + " is not a Leap Year");
                    }
                } else {
                    System.out.println(year + " is a Leap Year");
                }
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } else {
            System.out.println("Year must be >= 1582");
        }

        // Using single if statement with logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year");
        } else {
            System.out.println("Year must be >= 1582");
        }

        sc.close();
    }
}
