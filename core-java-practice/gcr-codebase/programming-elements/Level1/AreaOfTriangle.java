
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float area = (1.0f/2.0f)*base*height;
        System.out.println("The Area Of Triangle is "+ area);
    }
    
}
