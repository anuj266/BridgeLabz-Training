package scenrio_based;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class LibraryFine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Library Fine Calculator App");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		long fine;
		for(int i=0; i<5; i++) {
			System.out.println("Enetr Book "+(i+1)+" details:");
			System.out.print("Enter Return Date: ");
			String returnDate = input.next();
			LocalDate rDate = LocalDate.parse(returnDate, formatter);
			System.out.print("Enter Due Date: ");
			String dueDate = input.next();
			LocalDate dDate = LocalDate.parse(dueDate, formatter);
			if(rDate.isBefore(dDate)) {
				System.out.println("Book Returned On Time");
			}else {
				long days = ChronoUnit.DAYS.between(dDate, rDate);
				fine = days*5;
				System.out.println("You Have to pay Rs"+fine);
			}
		}
		input.close();
	}
}