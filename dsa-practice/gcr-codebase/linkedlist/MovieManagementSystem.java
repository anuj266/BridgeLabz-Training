package linkedlist;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

public class MovieManagementSystem {

    static MovieNode addAtStart(MovieNode Head, MovieNode Tail,
                                String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (Head == null) {
            Head = Tail = newNode;
            return Head;
        }

        newNode.next = Head;
        Head.prev = newNode;
        Head = newNode;

        return Head;
    }

    static MovieNode addAtLast(MovieNode Head, MovieNode Tail,
                               String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (Head == null) {
            Head = Tail = newNode;
            return Head;
        }

        Tail.next = newNode;
        newNode.prev = Tail;
        Tail = newNode;

        return Head;
    }

    static MovieNode addAtSpecificPosition(MovieNode Head,
                                           String title, String director, int year, double rating, int pos) {
        if (pos == 1) {
            return addAtStart(Head, null, title, director, year, rating);
        }

        MovieNode curr = Head;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null || curr.next == null) {
            System.out.println("Invalid Position");
            return Head;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next.prev = newNode;
        curr.next = newNode;

        return Head;
    }

    static MovieNode deleteByTitle(MovieNode Head, String title) {
        if (Head == null) {
            System.out.println("List is empty");
            return null;
        }

        MovieNode curr = Head;

        while (curr != null) {
            if (curr.title.equals(title)) {

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

        System.out.println("Movie not found");
        return Head;
    }

    static void searchByDirector(MovieNode Head, String director) {
        MovieNode curr = Head;
        boolean found = false;

        while (curr != null) {
            if (curr.director.equals(director)) {
                System.out.println(curr.title + " | " + curr.rating);
                found = true;
            }
            curr = curr.next;
        }

        if (!found)
            System.out.println("No movie found for director");
    }

    static void searchByRating(MovieNode Head, double rating) {
        MovieNode curr = Head;
        boolean found = false;

        while (curr != null) {
            if (curr.rating >= rating) {
                System.out.println(curr.title + " | " + curr.director);
                found = true;
            }
            curr = curr.next;
        }

        if (!found)
            System.out.println("No movie found with given rating");
    }

    static MovieNode updateRating(MovieNode Head, String title, double newRating) {
        MovieNode curr = Head;

        while (curr != null) {
            if (curr.title.equals(title)) {
                curr.rating = newRating;
                return Head;
            }
            curr = curr.next;
        }

        System.out.println("Movie not found");
        return Head;
    }

    static void displayForward(MovieNode Head) {
        MovieNode curr = Head;

        if (curr == null) {
            System.out.println("List is empty");
            return;
        }

        while (curr != null) {
            System.out.println(curr.title + " | " + curr.director + " | " +
                               curr.year + " | " + curr.rating);
            curr = curr.next;
        }
    }

    static void displayReverse(MovieNode Tail) {
        MovieNode curr = Tail;

        if (curr == null) {
            System.out.println("List is empty");
            return;
        }

        while (curr != null) {
            System.out.println(curr.title + " | " + curr.director + " | " +
                               curr.year + " | " + curr.rating);
            curr = curr.prev;
        }
    }

    public static void main(String[] args) {

        MovieNode Head = null;
        MovieNode Tail = null;

        Head = addAtStart(Head, Tail, "Inception", "Nolan", 2010, 9.0);
        Tail = Head;

        Head = addAtLast(Head, Tail, "Interstellar", "Nolan", 2014, 8.8);
        Tail = Tail.next;

        Head = addAtLast(Head, Tail, "Avatar", "Cameron", 2009, 7.9);
        Tail = Tail.next;

        Head = updateRating(Head, "Avatar", 8.2);

        searchByDirector(Head, "Nolan");
        searchByRating(Head, 8.5);

        System.out.println("\nForward Display");
        displayForward(Head);

        System.out.println("\nReverse Display");
        displayReverse(Tail);
    }
}
