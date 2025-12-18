package Level2;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();
        float Area = (1.0f/2.0f)*base*height;
        float inches = Area*0.393701f;
        System.out.println("The Area of the triangle in sq in is "+inches+" and sq cm is "+Area);
    }
}
