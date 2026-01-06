package scenrio_based;

import java.util.Scanner;

public class LibraryManagementSystem {

    static String[] titles = {
            "Java Programming",
            "Python Basics",
            "Data Structures",
            "Clean Code"
    };

    static String[] authors = {
            "James Gosling",
            "Guido van Rossum",
            "Mark Allen Weiss",
            "Robert Martin"
    };

    static boolean[] available = {
            true, true, false, true
    };

    static void showBooks() {
        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i] + " | " + authors[i] + " | " +
                    (available[i] ? "Available" : "Checked Out"));
        }
    }

    static void searchBook(String text) {
        boolean found = false;

        for (int i = 0; i < titles.length; i++) {
            if (titles[i].toLowerCase().contains(text.toLowerCase())) {
                System.out.println(titles[i] + " | " + authors[i] + " | " +
                        (available[i] ? "Available" : "Checked Out"));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching book found");
        }
    }

    static void checkoutBook(String name) {
        for (int i = 0; i < titles.length; i++) {
            if (titles[i].equalsIgnoreCase(name)) {
                if (available[i]) {
                    available[i] = false;
                    System.out.println("Book checked out successfully");
                } else {
                    System.out.println("Book already checked out");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        showBooks();

        System.out.print("\nSearch book: ");
        String search = sc.nextLine();
        searchBook(search);

        System.out.print("\nCheckout book (exact title): ");
        String checkout = sc.nextLine();
        checkoutBook(checkout);

        System.out.println();
        showBooks();
        sc.close();
    }
}

