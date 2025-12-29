package scenrio_based;
import java.util.*;
class FestivalLuckyDraw{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int visitors = sc.nextInt();
		for(int i=0;i<=visitors;i++) {
			System.out.println("....Welcome to diwali mela....");
			int luckyNumber = (int)(Math.random()*100)+1;
			System.out.println("This is your Lucky Number : "+ luckyNumber);
			if(luckyNumber%3==0 || luckyNumber%5==0) {
				System.out.println("...CONGRATULATIONS , You are our lucky Winner ");
			} else {
				System.out.println("Better luck next time");
			}
		}
	}
}