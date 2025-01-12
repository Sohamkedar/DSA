package Queue;
class Node { 
int data; 
Node next; 
Node(int data) { 
this.data = data; 
this.next = null; 
} 
} 
class LinkedQueue { 
private Node front; 
private Node rear; 
public LinkedQueue() { 
this.front = null; 
this.rear = null; 
} 
 
    // Enqueue operation 
    public void enqueue(int value) { 
        Node newNode = new Node(value); 
        if (rear == null) { 
            front = newNode; 
            rear = newNode; 
        } else { 
            rear.next = newNode; 
            rear = newNode; 
        } 
        System.out.println("Inserted " + value); 
    } 
 
    // Dequeue operation 
    public int dequeue() { 
        if (front == null) { 
            System.out.println("Queue is empty"); 
            return -1; 
        } 
        int value = front.data; 
        front = front.next; 
        if (front == null) { 
            rear = null; 
        } 
        return value; 
    } 
// Display the queue 
public void display() { 
if (front == null) { 
System.out.println("Queue is empty"); 
return; 
} 
Node temp = front; 
System.out.print("Queue elements: "); 
while (temp != null) { 
System.out.print(temp.data + " "); 
temp = temp.next; 
} 
System.out.println(); 
} 
// Peek the front element 
public int peek() { 
if (front == null) { 
System.out.println("Queue is empty"); 
return -1; 
} 
return front.data; 
} 
} 
class Main { 
public static void main(String[] args) { 
LinkedQueue queue = new LinkedQueue(); 
// Enqueue elements 
queue.enqueue(10); 
queue.enqueue(20); 
queue.enqueue(30); 
queue.enqueue(40); 
queue.enqueue(50); 
// Display elements 
queue.display(); 
// Dequeue elements 
System.out.println("Deleted " + queue.dequeue()); 
System.out.println("Deleted " + queue.dequeue()); 
// Display elements again 
queue.display(); 
// Enqueue more elements 
queue.enqueue(60); 
queue.enqueue(70); 
// Display elements again 
queue.display(); 
// Peek the front element 
System.out.println("Front element is " + queue.peek()); 
} 
} 