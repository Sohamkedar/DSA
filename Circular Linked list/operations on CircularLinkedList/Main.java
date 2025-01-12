package CircularLinkedList;
class Node { 
    int data; 
    Node next; 

    Node(int data) { 
        this.data = data; 
        this.next = null; 
    } 
}

class CircularLinkedList { 
    Node head = null; 
    Node tail = null; 

    // Insert a node at the end 
    void insert(int data) { 
        Node newNode = new Node(data); 
        if (head == null) { 
            head = newNode; 
            tail = newNode; 
            tail.next = head; // Point the next of tail to head 
        } else { 
            tail.next = newNode; 
            tail = newNode; 
            tail.next = head; // Maintain the circular nature 
        } 
    }

    // Delete a node by value 
    void delete(int data) { 
        if (head == null) { 
            System.out.println("List is empty."); 
            return; 
        } 
        Node current = head; 
        Node previous = null; 

        // If head needs to be removed 
        if (head.data == data) { 
            // If there's only one node in the list 
            if (head.next == head) { 
                head = null; 
                tail = null; 
                return; 
            } else { 
                head = head.next; 
                tail.next = head; 
                return; 
            } 
        } 

        do { 
            previous = current; 
            current = current.next; 
            if (current.data == data) { 
                previous.next = current.next; 
                if (current == tail) { 
                    tail = previous; 
                } 
                return; 
            } 
        } while (current != head); 
        System.out.println("Element not found."); 
    }

    // Display the list 
    void display() { 
        if (head == null) { 
            System.out.println("List is empty."); 
            return; 
        } 
        Node current = head; 
        do { 
            System.out.print(current.data + " -> "); 
            current = current.next; 
        } while (current != head); 
        System.out.println("(head)"); 
    } 
}

public class Main { 
    public static void main(String[] args) { 
        CircularLinkedList list = new CircularLinkedList(); 
        // Insert elements 
        list.insert(10); 
        list.insert(20); 
        list.insert(30); 
        list.insert(40); 

        // Display the list 
        System.out.print("Circular Linked List: "); 
        list.display(); 

        // Delete an element 
        list.delete(20); 

        // Display the list again 
        System.out.print("Circular Linked List after deletion: "); 
        list.display(); 

        // Delete the head 
        list.delete(10); 

        // Display the list again 
        System.out.print("Circular Linked List after deleting head: "); 
        list.display(); 
    } 
}
