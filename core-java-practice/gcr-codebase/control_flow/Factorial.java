package control_flow;
import java.util.*;
public class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = 1;
		while(number > 1) {
			factorial *= number--;
		}
		System.out.print(factorial);
		sc.close();
	}
}