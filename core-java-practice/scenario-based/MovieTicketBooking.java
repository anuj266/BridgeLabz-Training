package scenrio_based;

import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean app = true;
		System.out.println("...Welcome to Movie Ticket Booking App...");
		while (app) {
			int totalCost = 0;
			String movieName = "";
			String seatType = "";
			System.out.println("..Movie type..");
			System.out.println("1. Drama ($10)");
			System.out.println("2. Comedy ($15)");
			System.out.println("3. Romantic ($20)");
			System.out.println("4. Action ($30)");
			System.out.print("Enter choice (1-4): ");
			int movieChoice = input.nextInt();
			switch (movieChoice) {
			case 1:
				totalCost += 10;
				movieName = "Drama";
				break;
			case 2:
				totalCost += 15;
				movieName = "Comedy";
				break;
			case 3:
				totalCost += 20;
				movieName = "Romantic";
				break;
			case 4:
				totalCost += 30;
				movieName = "Action";
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("..Select Seat..");
			System.out.println("1. Silver ($10)");
			System.out.println("2. Gold ($20)");
			System.out.println("3. Premium ($30)");
			System.out.print("Enter choice (1-3): ");
			int seatChoice = input.nextInt();
			switch (seatChoice) {
			case 1:
				totalCost += 10;
				seatType = "Silver";
				break;
			case 2:
				totalCost += 20;
				seatType = "Gold";
				break;
			case 3:
				totalCost += 30;
				seatType = "Premium";
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Select Snacks:");
			System.out.println("1. Popcorn ($5)");
			System.out.println("2. Soda ($3)");
			System.out.println("3. Combo Pack ($7)");
			System.out.println("4. No Snacks");
			System.out.print("Enter choice (1-4): ");
			int snackChoice = input.nextInt();
			switch (snackChoice) {
			case 1:
				totalCost += 5;
				break;
			case 2:
				totalCost += 3;
				break;
			case 3:
				totalCost += 7;
				break;
			case 4:
				break; // Do nothing
			default:
				System.out.println("Invalid snack");
			}
			System.out.println("Movie: " + movieName);
			System.out.println("Seat:  " + seatType);
			System.out.println("Total: $" + totalCost);
			System.out.print("Book for another customer? (yes/no): ");
			String continueChoice = input.next();
			if (continueChoice.equalsIgnoreCase("no")) {
				app = false;
				System.out.println("System shutting down. Enjoy the movie!");
			}
		}
		input.close();
	}
}