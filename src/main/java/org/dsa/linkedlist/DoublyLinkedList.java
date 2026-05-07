package org.dsa.linkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

    /**
     * Check if list is empty
     * TC: O(1)
     * SC: O(1)
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Return size of linked list
     * TC: O(n)
     * SC: O(1)
     */
    public int size() {
        int count = 0;
        Node curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }

    /**
     * Traverse Forward
     * TC: O(n)
     * SC: O(1)
     */
    public void traverseForward() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

    /**
     * Traverse Backward
     * TC: O(n)
     * SC: O(1)
     */
    public void traverseBackward() {
        Node curr = tail;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.prev;
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

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    /**
     * Insert at end
     * TC: O(1)
     * SC: O(1)
     */
    public void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /**
     * Insert at specific position
     * TC: O(n)
     * SC: O(1)
     */
    public void insertAtPosition(int val, int pos) {
        int n = size();

        if (pos < 0 || pos > n) {
            throw new IndexOutOfBoundsException("Invalid position: " + pos);
        }

        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }

        if (pos == n) {
            insertAtEnd(val);
            return;
        }

        Node newNode = new Node(val);
        Node curr = head;

        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        newNode.prev = curr;

        curr.next.prev = newNode;
        curr.next = newNode;
    }
}