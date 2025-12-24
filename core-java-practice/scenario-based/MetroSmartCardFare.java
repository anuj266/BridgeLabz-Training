package scenrio_based;
import java.util.*;
class MetroSmartCardFare{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" .....Welcome to Delhi Metro ");
		int cardBalanace = 500;
		while(true) {
			System.out.println("Enter your Distance or press \"-1\" for exit ");
			
			int distance = sc.nextInt();
			if(distance == -1) {
				break;
			}
			int fare = distance*5;
			int remainingBalance = cardBalanace - fare;
			if(remainingBalance < 6) {
				System.out.println("Not sufficient Balance");
				break;
			}
			
			
		}
		sc.close();
	}
}