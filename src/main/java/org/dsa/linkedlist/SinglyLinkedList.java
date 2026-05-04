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
        Node new_node = new Node(x);
        new_node.next = head;
        head = new_node;
    }

    public void insertAtEnd(int x) {
        Node new_node = new Node(x);

        if (isEmpty()) {
            head = new_node;
            return;
        }

        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new_node;
    }
}
