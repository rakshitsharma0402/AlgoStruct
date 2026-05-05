package org.dsa;

import org.dsa.linkedlist.SinglyLinkedList;
import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        System.out.println("Welcome to Linked List");
        System.out.println("Please enter any one number to proceed:\n");

        System.out.println("1. For Insertion at the Beginning.");
        System.out.println("2. For Insertion at the End.");
        System.out.println("3. For Insertion at the Index.");
        System.out.println("4. For Deletion at the Beginning.");
        System.out.println("5. For Deletion at the End.");
        System.out.println("6. For Deletion at the Index.");

        System.out.println("\nEnter '0' to exit.");

        int num = sc.nextInt();

        while (num != 0) {

            switch (num) {

                case 1:
                    System.out.println("Please enter the value to be inserted : ");
                    int val1 = sc.nextInt();
                    singlyLinkedList.insertAtBeginning(val1);
                    break;

                case 2:
                    System.out.println("Please enter the value to be inserted : ");
                    int val2 = sc.nextInt();
                    singlyLinkedList.insertAtEnd(val2);
                    break;

                case 3:
                    System.out.println("Please enter the value to be inserted : ");
                    int val3 = sc.nextInt();
                    System.out.println("Please enter the index no. at which the value is to be inserted : ");
                    int pos1 = sc.nextInt();
                    singlyLinkedList.insertAtPosition(val3, pos1);
                    break;

                case 4:
                    singlyLinkedList.deleteAtBeginning();
                    break;

                case 5:
                    singlyLinkedList.deleteAtEnd();
                    break;

                case 6:
                    System.out.println("Please enter the index no. at which the value is to be deleted : ");
                    int pos2 = sc.nextInt();
                    singlyLinkedList.deleteAtPosition(pos2);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("\nEnter next choice:");
            num = sc.nextInt();
        }

        sc.close();
    }
}