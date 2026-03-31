package extras;

import java.time.LocalDate;

public class DateComparison {
	public static void main(String[] args) {
		LocalDate dateOne = LocalDate.of(2025, 12, 29);
		LocalDate dateTwo = LocalDate.of(2028, 01, 19);
		if (dateOne.isBefore(dateTwo)) {
			System.out.println("Date One is before Date Two");
		} else if (dateOne.isAfter(dateTwo)) {
			System.out.println("Date One is After Date Two");
		} else {
			System.out.println("Date One is equal to DateTwo");
		}
	}

}