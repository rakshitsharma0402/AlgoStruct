package org.dsa.stack;

public class StackUsingArray {

    private int[] arr;
    private int top;
    private int capacity;

    public StackUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    /**
     * Push Element
     * TC: O(1)
     * SC: O(1)
     */
    public void push(int val) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }

        arr[++top] = val;
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

        return arr[top--];
    }

    /**
     * Peek Top Element
     * TC: O(1)
     * SC: O(1)
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }

        return arr[top];
    }

    /**
     * Check Empty
     * TC: O(1)
     * SC: O(1)
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Check Full
     * TC: O(1)
     * SC: O(1)
     */
    public boolean isFull() {
        return top == capacity - 1;
    }

    /**
     * Stack Size
     * TC: O(1)
     * SC: O(1)
     */
    public int size() {
        return top + 1;
    }

    /**
     * Display Stack
     * TC: O(n)
     * SC: O(1)
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}