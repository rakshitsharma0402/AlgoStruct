import org.dsa.linkedlist.SinglyLinkedList;
import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println("\nWelcome to Linked List");

        int num;

        do {
            System.out.println("\nPlease enter any one number to proceed:\n");

            System.out.println("1. For Insertion at the Beginning.");
            System.out.println("2. For Insertion at the End.");
            System.out.println("3. For Insertion at the Index.");
            System.out.println("4. For Deletion at the Beginning.");
            System.out.println("5. For Deletion at the End.");
            System.out.println("6. For Deletion at the Index.");
            System.out.println("0. Exit\n");

            num = sc.nextInt();

            switch (num) {

                case 1:
                    System.out.print("\nPlease enter the value to be inserted : ");
                    singlyLinkedList.insertAtBeginning(sc.nextInt());
                    singlyLinkedList.traverse();
                    break;

                case 2:
                    System.out.print("\nPlease enter the value to be inserted : ");
                    singlyLinkedList.insertAtEnd(sc.nextInt());
                    singlyLinkedList.traverse();
                    break;

                case 3:
                    System.out.print("\nPlease enter the value to be inserted : ");
                    int val = sc.nextInt();
                    System.out.print("Please enter the index no. at which the value is to be inserted : ");
                    int pos = sc.nextInt();
                    singlyLinkedList.insertAtPosition(val, pos);
                    singlyLinkedList.traverse();
                    break;

                case 4:
                    singlyLinkedList.deleteAtBeginning();
                    singlyLinkedList.traverse();
                    break;

                case 5:
                    singlyLinkedList.deleteAtEnd();
                    singlyLinkedList.traverse();
                    break;

                case 6:
                    System.out.print("\nPlease enter the index no. at which the value is to be deleted : ");
                    singlyLinkedList.deleteAtPosition(sc.nextInt());
                    singlyLinkedList.traverse();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (num != 0);

        sc.close();
    }
}