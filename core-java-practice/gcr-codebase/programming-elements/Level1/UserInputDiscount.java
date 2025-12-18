package Level1;

import java.util.Scanner;

public class UserInputDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fees = input.nextInt();
        int discount = input.nextInt();
        int discount_amount = fees/discount;
        int discounted_fees = fees-discount_amount;
        System.out.println("The discount amount is INR "+discount_amount+" and the final discounted fees is INR "+discounted_fees);
    }
}
