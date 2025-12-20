package array;
import java.util.Scanner;
class Number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		// check for even positive , odd positive , negative , zero
		for(int num : arr) {
			if(num > 0) {
				if(num % 2 == 0) {
					System.out.println("The" + num + "is even positive number");
				} else {
					System.out.println("The" + num + "is odd positive number");
				}
			} else if (num < 0) {
				System.out.println("The" + num + "is negative number");
			} else {
				System.out.println("The" + num + "is zero");
			}
		}
		//compare the first and last element of array  
		if(arr[0]==arr[arr.length-1]) {
			System.out.println("First and last elements are equal");
		} else if (arr[0]>arr[arr.length-1]) {
			System.out.println("First number is larger than last");
		} else {
			System.out.println("Last number is larger than first");
		}
		
		sc.close();
	}
}