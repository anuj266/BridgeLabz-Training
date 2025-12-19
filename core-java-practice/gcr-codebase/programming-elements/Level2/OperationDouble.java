package level2;

import java.util.Scanner;

public class OperationDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        System.out.println("The results of Int Operations are "+(a + b * c)+", "+(a * b + c)+", "+(c + a / b)+" and "+(a % b + c));
    }
}
