package org.dsa.stack;

import org.dsa.linkedlist.Node;

public class StackUsingLinkedList {

    private Node top;
    private int size;

    /**
     * Push Element
     * TC: O(1)
     * SC: O(1)
     */
    public void push(int val) {
        Node newNode = new Node(val);

        newNode.next = top;
        top = newNode;

        size++;
    }

    /**
     * Pop Element
     * TC: O(1)
     * SC: O(1)
     */
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }

        int val = top.data;
        top = top.next;

        size--;

        return val;
    }

    /**
     * Peek Element
     * TC: O(1)
     * SC: O(1)
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return top.data;
    }

    /**
     * Check Empty
     * TC: O(1)
     * SC: O(1)
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Stack Size
     * TC: O(1)
     * SC: O(1)
     */
    public int size() {
        return size;
    }

    /**
     * Display Stack
     * TC: O(n)
     * SC: O(1)
     */
    public void display() {
        Node curr = top;

        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}