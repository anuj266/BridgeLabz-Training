package scenrio_based;
import java.util.*;
class BusRouteDistanceTracker{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distancePerStop = 5;
		int totalDistance  = 0;
		System.out.println("....Wecome to UP Roadways....");
		while(true) {
			System.out.println("If you want to continue your journey type \"Yes\" otherwise type \"No\" ");
			String str = sc.next();
			if(str.equalsIgnoreCase("yes")) {
				totalDistance += distancePerStop;
			} else {
				break;
			}
			
		}
		System.out.println("Your total fare is = " + totalDistance);
		sc.close();
	}
}