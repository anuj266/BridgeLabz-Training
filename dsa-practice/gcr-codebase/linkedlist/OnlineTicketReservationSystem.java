package linkedlist;
class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName,
               int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class OnlineTicketReservationSystem {

    static TicketNode head = null;

    static void addTicket(int id, String customer, String movie,
                          int seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        TicketNode curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = head;
    }

    static void removeTicket(int ticketId) {

        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = null;

        if (head.ticketId == ticketId) {

            if (head.next == head) {
                head = null;
                return;
            }

            TicketNode last = head;
            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;
            return;
        }

        while (curr.next != head && curr.ticketId != ticketId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr.ticketId == ticketId) {
            prev.next = curr.next;
        } else {
            System.out.println("Ticket not found");
        }
    }

    static void searchTicket(String key) {

        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        TicketNode curr = head;
        boolean found = false;

        do {
            if (curr.customerName.equalsIgnoreCase(key) ||
                curr.movieName.equalsIgnoreCase(key)) {

                System.out.println(
                    curr.ticketId + " " +
                    curr.customerName + " " +
                    curr.movieName + " " +
                    curr.seatNumber + " " +
                    curr.bookingTime
                );
                found = true;
            }
            curr = curr.next;
        } while (curr != head);

        if (!found) {
            System.out.println("Ticket not found");
        }
    }

    static void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode curr = head;
        do {
            System.out.println(
                curr.ticketId + " " +
                curr.customerName + " " +
                curr.movieName + " " +
                curr.seatNumber + " " +
                curr.bookingTime
            );
            curr = curr.next;
        } while (curr != head);
    }

    static int countTickets() {

        if (head == null)
            return 0;

        int count = 0;
        TicketNode curr = head;

        do {
            count++;
            curr = curr.next;
        } while (curr != head);

        return count;
    }

    public static void main(String[] args) {

        addTicket(1, "Anuj", "Inception", 10, "10:00 AM");
        addTicket(2, "Rahul", "Interstellar", 12, "11:00 AM");
        addTicket(3, "Priya", "Inception", 15, "12:00 PM");

        displayTickets();

        System.out.println("\nSearch Result:");
        searchTicket("Inception");

        removeTicket(2);

        System.out.println("\nAfter Deletion:");
        displayTickets();

        System.out.println("\nTotal Tickets: " + countTickets());
    }
}

