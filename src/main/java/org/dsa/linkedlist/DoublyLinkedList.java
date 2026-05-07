package org.dsa.linkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

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
}