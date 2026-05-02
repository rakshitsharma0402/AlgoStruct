package org.dsa.linkedlist;

public class SinglyLinkedList {

    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void traverse() {
        if(isEmpty()) {
            System.out.print("Linked List is Empty");
            return;
        }

        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }

}