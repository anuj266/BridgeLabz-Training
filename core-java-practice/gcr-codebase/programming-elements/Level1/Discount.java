public class Discount {
    public static void main(String[] args) {
        int fees = 125000;
        int discount = 10;
        int discount_amount = fees/discount;
        int discounted_fees = fees-discount_amount;
        System.out.println("The discount amount is INR "+discount_amount+" and the final discounted fees is "+discounted_fees);
    }
}
