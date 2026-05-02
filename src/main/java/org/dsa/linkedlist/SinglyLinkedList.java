package org.dsa.linkedlist;

public class SinglyLinkedList {

    private Node head;

    public void traversal() {
        if (head == null) {
            System.out.println("List is empty");
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