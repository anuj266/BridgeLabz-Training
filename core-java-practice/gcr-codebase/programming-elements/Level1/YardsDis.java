package Level1;

import java.util.Scanner;

public class YardsDis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float feet = sc.nextFloat();
        Double yards = 0.333*feet; 
        Double mile = 0.001*yards;
        System.out.println("The distance in feet is "+feet+" in yards is "+yards+" and in miles is "+mile);
    }
}
