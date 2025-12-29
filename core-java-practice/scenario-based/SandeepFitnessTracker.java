package scenrio_based;

import java.util.Scanner;

public class SandeepFitnessTracker {
	
	public static int average(int total, int count) {
		return total/count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] pushups = new int[7]; 
		int count = 1;
		for(int i=0; i<7; i++) {
			System.out.print("Enter no. of pushups on day "+(count++)+" and enter \'0\' for rest days: ");
			pushups[i] = input.nextInt();
		}
		int total = 0;
		count = 1;
		for(int i:pushups) {
			System.out.println("Day "+count);
			if(!(i == 0)) {
				total = total+i;
				System.out.println("Total pushups: "+total);
				int avg = average(total,count++);
				System.out.println("Average pushups: "+avg);
			}else {
				System.out.println("Rest Day");
			}
		}
		input.close();
	}

}