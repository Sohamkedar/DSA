package Linkedlist;
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
	            System.out.println("3. Reverse List"); 
	            System.out.println("4. Search Node"); 
	            System.out.println("5. Count Nodes"); 
	            System.out.println("6. Display List"); 
	            System.out.println("7. Exit"); 
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
	                    list.reverse(); 
	                    System.out.println("List reversed."); 
	                    break; 
	                case 4: 
	                    System.out.print("Enter data to search: "); 
	                    int searchData = scanner.nextInt(); 
	                    if (list.search(searchData)) { 
	                        System.out.println("Data " + searchData + " found."); 
	                    } else { 
	                        System.out.println("Data " + searchData + " not found."); 
	                    } 
	                    break; 
	                case 5: 
	                    System.out.println("Total nodes: " + list.count()); 
	                    break; 
	                case 6: 
	                    System.out.print("Linked list: "); 
	                    list.display(); 
	break; 
	case 7: 
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