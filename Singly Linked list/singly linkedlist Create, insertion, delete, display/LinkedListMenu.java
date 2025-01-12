package linkedlist;

import java.util.Scanner;

public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Create List");
            System.out.println("2. Insert Node");
            System.out.println("3. Delete Node");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to create list: ");
                    int createData = scanner.nextInt();
                    list.create(createData);
                    System.out.println("List created with data " + createData);
                    break;
                case 2:
                    System.out.print("Enter data to insert: ");
                    int insertData = scanner.nextInt();
                    list.insert(insertData);
                    System.out.println("Data " + insertData + " inserted.");
                    break;
                case 3:
                    System.out.print("Enter data to delete: ");
                    int deleteData = scanner.nextInt();
                    list.delete(deleteData);
                    System.out.println("Data " + deleteData + " deleted.");
                    break;
                case 4:
                    System.out.print("Linked list: ");
                    list.display();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
