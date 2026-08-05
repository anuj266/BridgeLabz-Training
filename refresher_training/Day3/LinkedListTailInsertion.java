import java.util.*;

public class LinkedListTailInsertion {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (head == null)
            return node;

        SinglyLinkedListNode curr = head;

        while (curr.next != null)
            curr = curr.next;

        curr.next = node;

        return head;
    }

    static void printList(SinglyLinkedListNode head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinglyLinkedListNode head = null;
        for (int i = 0; i < n; i++) {
            head = insertNodeAtTail(head, sc.nextInt());
        }
        printList(head);
        sc.close();
    }
}