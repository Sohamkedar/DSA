package doublylinkedlist; 

public class Node { 
int data; 
Node prev; 
Node next; 
Node(int data) { 
this.data = data; 
this.prev = null; 
this.next = null; 
} 
} 
class DoublyLinkedList{ 
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
 
    // Sort the list using insertion sort 
    void sort() { 
        if (head == null || head.next == null) return; 
 
        Node current = head.next; 
        while (current != null) { 
            Node next = current.next; 
            Node prev = current.prev; 
            while (prev != null && prev.data > 
current.data) { 
                prev = prev.prev; 
            } 
            if (prev == null) { 
                if (current.prev != null) 
current.prev.next = current.next; 
                if (current.next != null) 
current.next.prev = current.prev; 
                current.next = head; 
                head.prev = current; 
                head = current; 
                current.prev = null; 
            } else if (prev.next != current) { 
                if (current.prev != null) 
current.prev.next = current.next; 
                if (current.next != null) 
current.next.prev = current.prev; 
                current.next = prev.next; 
                if (prev.next != null) prev.next.prev = 
current; 
                prev.next = current; 
                current.prev = prev; 
            } 
            current = next; 
        } 
    } 
 
    // Display the list 
    void display() { 
        Node current = head; 
        while (current != null) { 
            System.out.print(current.data + " "); 
            current = current.next; 
        } 
        System.out.println(); 
    } 
} 