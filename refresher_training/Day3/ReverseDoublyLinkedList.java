import java.util.*;

public class ReverseDoublyLinkedList {

    static class DoublyLinkedListNode {
        int data;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;

        DoublyLinkedListNode(int data) {
            this.data = data;
        }
    }

    static class DoublyLinkedList {
        DoublyLinkedListNode head;
        DoublyLinkedListNode tail;

        void insertNode(int data) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(data);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
        }
    }

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {

        if (llist == null)
            return null;

        DoublyLinkedListNode curr = llist;
        DoublyLinkedListNode temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) {
            llist = temp.prev;
        }
        return llist;
    }

    public static void printList(DoublyLinkedListNode head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            DoublyLinkedList list = new DoublyLinkedList();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.insertNode(sc.nextInt());
            }
            DoublyLinkedListNode head = reverse(list.head);
            printList(head);
        }

        sc.close();
    }
}