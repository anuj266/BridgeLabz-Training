package scenario_based;
import java.util.*;

public class LineComparisionComputation {

	public static Double findLength() {
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		Double length = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
		return length;
	}

	public static void main(String[] args) {

		// UC 1: Length of Line Calculation.
		System.out.print("Enter Co-ordinates for Line 1: ");
		Double length1 = findLength();
		System.out.println("Length Of Line1: " + length1);
		System.out.print("Enter Co-ordinates for Line 1: ");
		Double length2 = findLength();
		System.out.println("Length Of Line2: " + length2);

		// UC 2: Equality Of Two Lines.
		if (length1.equals(length2)) {
			System.out.println("Both the Lines are equal.");
		} else {
			System.out.println("Both the Lines are not equal.");
		}

		// UC 3: Using compareTo method for comparison.
		int result = length1.compareTo(length2);
		if (result > 0) {
			System.out.println("Line 1 is greator than the Line 2");
		} else if (result < 0) {
			System.out.println("Line 1 is less than the Line 2");
		} else {
			System.out.println("Line 1 is equal to Line 2");
		}
	}

}