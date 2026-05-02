package org.dsa.linkedlist;

public class SinglyLinkedList {

    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    public void insertAtBeginning(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }
}
