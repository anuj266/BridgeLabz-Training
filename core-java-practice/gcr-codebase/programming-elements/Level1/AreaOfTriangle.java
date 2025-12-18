package Level1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float Area = (1.0f/2.0f)*base*height;
        System.out.println("The Area Of Triangle is "+ Area);
    }
    
}
