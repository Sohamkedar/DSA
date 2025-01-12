package Linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
	Node head = null; 
	void create(int data)    // Create list 
	{ 
	head = new Node(data); 
	} 
	void insert(int data) // Insert new node 
	 { 
	        Node newNode = new Node(data); 
	        if (head == null) { 
	            head = newNode; 
	        } else { 
	            Node current = head; 
	            while (current.next != null) { 
	                current = current.next; 
	            } 
	            current.next = newNode; 
	        } 
	    } 
	    void reverse()    // Reverse the list 
	{ 
	        Node prev = null; 
	        Node current = head; 
	        Node next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        head = prev; 
	    } 
	    // Search element in the list 
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
	    // Count elements in the list 
	    int count() { 
	        Node current = head; 
	        int count = 0; 
	        while (current != null) { 
	            count++; 
	            current = current.next; 
	        } 
	        return count; 
	    } 
	    // Display list 
	    void display() { 
	        if (head == null) { 
	            System.out.println("List is empty."); 
	            return; 
	        } 
	        Node current = head; 
	        while (current != null) { 
	            System.out.print(current.data + " -> "); 
	            current = current.next; 
	        } 
	        System.out.println("null"); 
	    } 
	}