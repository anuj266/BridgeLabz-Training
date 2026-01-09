package linkedlist;

class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;
    BookNode next;
    BookNode prev;

    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}

public class LibraryManagementSystem {

    static BookNode addAtStart(BookNode Head, BookNode Tail,
                               int bookId, String title, String author,
                               String genre, boolean isAvailable) {

        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);

        if (Head == null) {
            Head = Tail = newNode;
            return Head;
        }

        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;

        return Head;
    }

    static BookNode addAtLast(BookNode Head, BookNode Tail,
                              int bookId, String title, String author,
                              String genre, boolean isAvailable) {

        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);

        if (Head == null) {
            Head = Tail = newNode;
            return Head;
        }

        Tail.next = newNode;
        newNode.prev = Tail;
        Tail = newNode;

        return Head;
    }

    static BookNode addAtSpecificPosition(BookNode Head,
                                          int bookId, String title, String author,
                                          String genre, boolean isAvailable, int pos) {

        if (pos == 1) {
            return addAtStart(Head, null, bookId, title, author, genre, isAvailable);
        }

        BookNode curr = Head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null) {
            System.out.println("Invalid Position");
            return Head;
        }

        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next.prev = newNode;
        curr.next = newNode;

        return Head;
    }

    static BookNode delete(BookNode Head, int bookId) {
        if (Head == null) {
            System.out.println("Library is empty");
            return null;
        }

        BookNode curr = Head;

        while (curr != null) {
            if (curr.bookId == bookId) {

                if (curr.prev != null)
                    curr.prev.next = curr.next;
                else
                    Head = curr.next;

                if (curr.next != null)
                    curr.next.prev = curr.prev;

                return Head;
            }
            curr = curr.next;
        }

        System.out.println("Book not found");
        return Head;
    }

    static void searchByTitle(BookNode Head, String title) {
        BookNode curr = Head;

        while (curr != null) {
            if (curr.title.equals(title)) {
                System.out.println("Found: " + curr.bookId + " " + curr.author);
                return;
            }
            curr = curr.next;
        }

        System.out.println("Book not found");
    }

    static void searchByAuthor(BookNode Head, String author) {
        BookNode curr = Head;
        boolean found = false;

        while (curr != null) {
            if (curr.author.equals(author)) {
                System.out.println(curr.bookId + " " + curr.title);
                found = true;
            }
            curr = curr.next;
        }

        if (!found)
            System.out.println("No books found for author");
    }

    static BookNode updateAvailability(BookNode Head, int bookId, boolean status) {
        BookNode curr = Head;

        while (curr != null) {
            if (curr.bookId == bookId) {
                curr.isAvailable = status;
                return Head;
            }
            curr = curr.next;
        }

        System.out.println("Book not found");
        return Head;
    }

    static void displayForward(BookNode Head) {
        BookNode curr = Head;

        if (curr == null) {
            System.out.println("Library is empty");
            return;
        }

        while (curr != null) {
            System.out.println(curr.bookId + " " + curr.title + " "
                    + curr.author + " " + curr.genre + " "
                    + (curr.isAvailable ? "Available" : "Issued"));
            curr = curr.next;
        }
    }

    static void displayReverse(BookNode Tail) {
        BookNode curr = Tail;

        if (curr == null) {
            System.out.println("Library is empty");
            return;
        }

        while (curr != null) {
            System.out.println(curr.bookId + " " + curr.title + " "
                    + curr.author + " " + curr.genre + " "
                    + (curr.isAvailable ? "Available" : "Issued"));
            curr = curr.prev;
        }
    }

    static void countBooks(BookNode Head) {
        int count = 0;
        BookNode curr = Head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        System.out.println("Total Books: " + count);
    }

    public static void main(String[] args) {

        BookNode Head = null;
        BookNode Tail = null;

        Head = addAtStart(Head, Tail, 1, "Java Basics", "Herbert Schildt", "Programming", true);
        Tail = Head;

        Head = addAtLast(Head, Tail, 2, "Clean Code", "Robert Martin", "Software", true);
        Tail = Tail.next;

        Head = addAtLast(Head, Tail, 3, "Algorithms", "CLRS", "DSA", false);
        Tail = Tail.next;

        Head = updateAvailability(Head, 3, true);

        searchByAuthor(Head, "Robert Martin");
        searchByTitle(Head, "Algorithms");

        System.out.println("\nForward Display");
        displayForward(Head);

        System.out.println("\nReverse Display");
        displayReverse(Tail);

        countBooks(Head);
    }
}
