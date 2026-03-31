package runtime_analysis;

import java.util.Scanner;

public class StringConcatenationPerformance {
	static void stringPerformance(long n) {
		long startTime,endTime;
		startTime=System.nanoTime();
		String s="Java";
		for(int i=0;i<n;i++) {
			s+="Performance Test";
		}
		endTime=System.nanoTime();
		System.out.println("String Time: "+(endTime-startTime)/1000000+" ms");
	}
	static void stringBuilderPerformance(long n) {
		long startTime, endTime;
		startTime=System.nanoTime();
		StringBuilder sb=new StringBuilder("Java");
		for(int i=0;i<n;i++) {
			sb.append("Performance Test");
		}
		endTime=System.nanoTime();
		System.out.println("StringBuilder Time: "+(endTime-startTime)/1000000+" ms");
	}
	static void stringBufferPerformance(long n) {
		long startTime, endTime;
		startTime=System.nanoTime();
		StringBuffer sbf=new StringBuffer("Java");
		for(int i=0;i<n;i++) {
			sbf.append("Performance Test");
		}
		endTime=System.nanoTime();
		System.out.println("StringBuffer Time: "+(endTime-startTime)/1000000+" ms");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of operations: ");
		long n=sc.nextLong();
		stringPerformance(n);
		stringBuilderPerformance(n);
		stringBufferPerformance(n);
		sc.close();
	}
}
