// find the sum until the user enters 0 or a negative number using while loop and break statement
package control_flow;
import java.util.Scanner;
public class SumOfNumbers2 {
    public static void main(String[] args) {
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true){
            float number = sc.nextFloat();
            if(number <= 0){
                break;
            }
            sum += number;
        }
        System.out.println(sum);
        sc.close();
    }
}
