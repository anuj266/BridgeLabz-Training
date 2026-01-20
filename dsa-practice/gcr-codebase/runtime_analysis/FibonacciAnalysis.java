package runtime_analysis;

import java.util.Scanner;

public class FibonacciAnalysis {
	static int fibonacciRecursive(int n) {
	    if (n <= 1) return n;
	    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	static int fibonacciIterative(int n) {
	    int a = 0, b = 1, sum;
	    for (int i = 2; i <= n; i++) {
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    return b;
	}
	
	public static void main(String[] args) {
		long startTime,endTime;
		System.out.print("Enter the position: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		startTime=System.nanoTime();
		fibonacciRecursive(n);
		endTime=System.nanoTime();
		System.out.println("Recursive Time: "+(endTime-startTime)+" ns, "+(endTime-startTime)/1000000+" ms");
		startTime=System.nanoTime();
		fibonacciIterative(n);
		endTime=System.nanoTime();
		System.out.println("Iterative Time: "+(endTime-startTime)+" ns, "+(endTime-startTime)/1000000+" ms");
		sc.close();
	}

}
