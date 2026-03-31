package scenrio_based;
import java.util.*;
class ElectionBoothManager{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Polling booth ");
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		while(true) {
			System.out.println("Please enter your age or Enter \"exit\" to stop the polling");
			String text = sc.next();
			if(text.equalsIgnoreCase("exit")) {
				break;
			}
			int age = Integer.parseInt(text);
			if(age>=18) {
				System.out.println("You are eligible to vote");
			} else {
				System.out.println("You are not eligible to vote");
			}
			System.out.println("Press 1 for BJP , Press 2 for Congress , Press 3 for AAP");
			int vote = sc.nextInt();
			if(vote == 1) {
				count1++;
			} else if (vote == 2) {
				count2++;
			} else {
				count3++;
			}
		}
		System.out.println("Total no of votes : " + (count1 + count2 + count3));
		System.out.println("The party BJP got "+ count1 + " votes" );
		System.out.println("The party Congress got "+ count2 + " votes" );
		System.out.println("The party AAP got "+ count3 + " votes" );
		sc.close();
		
	}
}