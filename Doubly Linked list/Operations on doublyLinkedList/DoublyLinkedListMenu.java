package doublyLinkedList01; 
 
import java.util.Scanner; 
 
public class DoublyLinkedListMenu { 
 public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        DoublyLinkedList list = new DoublyLinkedList(); 
        boolean exit = false; 
 
        while (!exit) { 
            System.out.println("\nMenu:"); 
            System.out.println("1. Insert Node"); 
            System.out.println("2. Delete Node"); 
            System.out.println("3. Display List"); 
            System.out.println("4. Search Node"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter your choice: "); 
            int choice = scanner.nextInt(); 
 
            switch (choice) { 
                case 1: 
                    System.out.print("Enter data to insert: "); 
                    int insertData = scanner.nextInt(); 
                    list.insert(insertData); 
                    System.out.println("Data " + insertData + " inserted."); 
                    break; 
                case 2: 
                    System.out.print("Enter data to delete: "); 
                    int deleteData = scanner.nextInt(); 
                    list.delete(deleteData); 
                    break; 
                case 3: 
                    System.out.print("Linked list: "); 
                    list.display(); 
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