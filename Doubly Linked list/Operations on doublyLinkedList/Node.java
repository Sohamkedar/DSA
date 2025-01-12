package doublyLinkedList01; 
 
class Node { 
    int data; 
    Node prev; 
    Node next; 
 
    Node(int data) { 
        this.data = data; 
        this.prev = null; 
        this.next = null; 
    } 
} 
 
class DoublyLinkedList { 
    Node head; 
 
    // Insert at the end 
    void insert(int data) { 
        Node newNode = new Node(data); 
        if (head == null) { 
            head = newNode; 
            return; 
        } 
        Node current = head; 
        while (current.next != null) { 
            current = current.next; 
        } 
        current.next = newNode; 
        newNode.prev = current; 
    } 
 
    // Delete a node 
    void delete(int data) { 
        if (head == null) { 
            System.out.println("List is empty."); 
            return; 
        } 
 
        Node current = head; 
        while (current != null && current.data != data) { 
            current = current.next; 
        } 
 
        if (current == null) { 
            System.out.println("Element not found."); 
            return; 
        } 
 
        if (current.prev != null) { 
            current.prev.next = current.next; 
        } else { 
            head = current.next; 
        } 
 
        if (current.next != null) { 
            current.next.prev = current.prev; 
        } 
 
        System.out.println("Element deleted."); 
    } 
 
    // Display the list 
    void display() { 
        if (head == null) { 
            System.out.println("List is empty."); 
            return; 
        } 
 
        Node current = head; 
        while (current != null) { 
            System.out.print(current.data + " "); 
            current = current.next; 
        } 
        System.out.println(); 
    } 
 
    // Search for a node 
    boolean search(int data) { 
        Node current = head; 
        while (current != null) { 
            if (current.data == data) { 
                return true; 
            } 
            current = current.next; 
        } 
        return false; 
    } 
} 