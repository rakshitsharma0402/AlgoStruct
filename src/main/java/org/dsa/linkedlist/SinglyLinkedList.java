package org.dsa.linkedlist;

/**
 * Singly Linked List implementation for DSA library.
 */
public class SinglyLinkedList {

    private Node head;
    private int size;

    /**
     * Check if list is empty
     * TC: O(1)
     * SC: O(1)
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Get size in O(1)
     * TC: O(1)
     * SC: O(1)
     */
    public int size() {
        return size;
    }

    /**
     * Traverse list
     * TC: O(n)
     * SC: O(1)
     */
    public void traverse() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Linked List is Empty");
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
     * TC: O(1)
     * SC: O(1)
     */
    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Insert at end
     * TC: O(n)
     * SC: O(1)
     * <p>
     * Note: Can be optimized to TC: O(1) using a tail pointer
     */
    public void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (isEmpty()) {
            insertAtBeginning(val);
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
     * TC: O(pos)
     * SC: O(1)
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

    /**
     * Delete at beginning
     * TC: O(1)
     * SC: O(1)
     */
    public void deleteAtBeginning() {
        if(isEmpty())
            throw new IndexOutOfBoundsException("Linked List Empty");

        head = head.next;
        size--;
    }

    /**
     * Delete at end
     * TC: O(n)
     * SC: O(1)
     */
    public void deleteAtEnd() {
        if(isEmpty())
            throw new IndexOutOfBoundsException("Linked List Empty");

        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
        size--;
    }

    /**
     * Delete at specific position (0-based)
     * TC: O(pos)
     * SC: O(1)
     */
    public void deleteAtPosition(int pos) {
        if(pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException("Invalid Position" +pos);

        if(pos == 0) {
            deleteAtBeginning();
        }

        Node curr = head;
        for(int i=0; i<pos-1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        size--;
    }


}