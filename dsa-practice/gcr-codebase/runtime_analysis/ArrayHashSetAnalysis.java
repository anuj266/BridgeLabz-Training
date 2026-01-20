package runtime_analysis;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayHashSetAnalysis {
	
	public static void main(String[] args) {
		long startTime,endTime;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the datasize: ");
		int n=sc.nextInt();
		int target=-1;
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=i+1;
		}
		startTime=System.nanoTime();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(target==arr[i]) {
				endTime=System.nanoTime();
				System.out.println("Array Search Time: "+(endTime-startTime)+" ns");
				found=true;
				break;
			}
		}
		if(!found) {
			endTime=System.nanoTime();
			System.out.println("Array Search Time: "+(endTime-startTime)+" ns");
		}
		
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++) {
			set.add(i+1);
		}
		startTime=System.nanoTime();
		set.contains(target);
		endTime=System.nanoTime();
		System.out.println("HashSet Search Time: "+(endTime-startTime)+" ns");
		sc.close();
	}

}
