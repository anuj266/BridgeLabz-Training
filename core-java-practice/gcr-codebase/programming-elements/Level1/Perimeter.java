package level1;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float perimeter = 4*side;
        System.out.println("The length of the side is "+side+" whose perimeter is " +perimeter);
    }
}
