package org.dsa.linkedlist;

public class SinglyLinkedList {

    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            count++;
        }
        return count;
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

    public void insertAtEnd(int x) {
        Node temp = new Node(x);
        for()
    }
}
