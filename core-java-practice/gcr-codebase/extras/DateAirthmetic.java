package extras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAirthmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.print("Enter date (dd-MM-yyyy): ");
		String input = sc.nextLine();
		LocalDate date = LocalDate.parse(input, formatter);
		date = date.plusDays(7);
		date = date.plusMonths(1);
		date = date.plusYears(2);
		date = date.minusWeeks(3);
		System.out.println("Final Date: " + date.format(formatter));
		sc.close();
	}
}
