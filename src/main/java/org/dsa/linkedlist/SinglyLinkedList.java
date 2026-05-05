package org.dsa.linkedlist;

/**
 * Singly Linked List implementation for DSA library.
 */
public class SinglyLinkedList {

    private Node head;
    private int size;

    /**
     * Check if list is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Get size in O(1)
     */
    public int size() {
        return size;
    }

    /**
     * Traverse list
     */
    public void traverse() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Linked List is Empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    /**
     * Insert at beginning
     */
    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Insert at end
     */
    public void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        size++;
    }

    /**
     * Insert at specific position (0-based)
     */
    public void insertAtPosition(int val, int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position: " + pos);
        }

        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node curr = head;

        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
}
