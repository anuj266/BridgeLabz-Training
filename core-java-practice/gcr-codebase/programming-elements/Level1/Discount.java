public class Discount {
    public static void main(String[] args) {
        int fees = 125000;
        int discount = 10;
        int discountAmount = fees/discount;
        int discountedFees = fees-discountAmount;
        System.out.println("The discount amount is INR "+discountAmount+" and the final discounted fees is "+discountedFees);
    }
}
