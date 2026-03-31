package level1;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float unitPrice = sc.nextFloat();
        float quantity = sc.nextFloat();
        float total = unitPrice*quantity;
        System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
    }
    
}
