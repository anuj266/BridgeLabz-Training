// The line `package scenario_based;` is declaring the package name for the Java class `CoffeeShop`. In
// Java, packages are used to organize classes into namespaces, making it easier to manage and maintain
// code. By specifying the package name at the beginning of the file, the Java class `CoffeeShop`
// belongs to the `scenario_based` package. This helps in avoiding naming conflicts and provides a
// structured way to organize related classes.
// package scenario_based;
import java.util.Scanner;
class CoffeeShop{
	public static void main(String[] args) {
		while(true) {
			System.out.print("Enter the coffee type (espresso , latte , cappuccino) and 'exit' for quit : ");
			Scanner sc = new Scanner(System.in);
			double gst = 0.05; //5% GST;
			String typeOfCoffee = sc.nextLine();
			if(typeOfCoffee.equals("exit")) {
//				System.out.println("Thanks for visiting , see you soon");
				break;
			}
			double price = 0.0;
			switch (typeOfCoffee) {
			case "espresso" :
				price = 80.0;
				break;
			case "latte" :
				price = 89.0;
				break;
			case "cappuccino" :
				price = 106.0;
				break;
			default :
				System.out.println("Invalid Coffee type");
				continue;
			}
			System.out.println("Enter Quantity");
			int quantity = sc.nextInt();
			double totalPrice = price*quantity;
			double totalPriceIncludingGST = totalPrice + totalPrice*gst;
			System.out.printf("Total Price (Including GST) : $%.2f%n", totalPriceIncludingGST);
			System.out.println("Bill Generated Successfully");
			System.out.println("Coffee Type : " + typeOfCoffee);
			System.out.println("Quantity : " + quantity);
			System.out.println("Total Price : $" + totalPrice);
			System.out.printf("Total Price (Including GST) : $%.2f%n", totalPriceIncludingGST);

			sc.close();
			
			
			
		}
		System.out.println("Thanks for visit , See you soon");
		
	}
}