package level1;

import java.util.Scanner;

public class UserInputDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fees = input.nextInt();
        int discount = input.nextInt();
        int discountAmount = fees/discount;
        int discountedFees = fees-discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and the final discounted fees is INR "+discountedFees);
    }
}
