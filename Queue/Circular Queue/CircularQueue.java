package Queue;

class CircularQueue { 
private int[] queue; 
private int front; 
private int rear; 
private int size; 
private int capacity; 
public CircularQueue(int capacity) { 
this.capacity = capacity; 
queue = new int[capacity]; 
front = -1; 
rear = -1; 
size = 0; 
} 
// Check if the queue is empty 
public boolean isEmpty() { 
return size == 0; 
} 
// Check if the queue is full 
public boolean isFull() { 
return size == capacity; 
} 
// Enqueue operation 
public void enqueue(int value) { 
if (isFull()) { 
System.out.println("Queue is full"); 
return; 
} 
if (front == -1) { 
front = 0; 
} 
rear = (rear + 1) % capacity; 
queue[rear] = value; 
size++; 
System.out.println("Inserted " + value); 
} 
// Dequeue operation 
public int dequeue() { 
if (isEmpty()) { 
System.out.println("Queue is empty"); 
return -1; 
} 
int value = queue[front]; 
front = (front + 1) % capacity; 
size--; 
return value; 
} 
// Display the queue 
public void display() { 
if (isEmpty()) { 
System.out.println("Queue is empty"); 
return; 
} 
System.out.print("Queue elements: "); 
for (int i = 0; i < size; i++) { 
System.out.print(queue[(front + i) % capacity] + " "); 
} 
System.out.println(); 
} 
// Peek the front element 
public int peek() { 
if (isEmpty()) { 
System.out.println("Queue is empty"); 
return -1; 
} 
return queue[front]; 
} 
} 
class Main { 
public static void main(String[] args) { 
CircularQueue queue = new CircularQueue(5); 
// Enqueue elements 
queue.enqueue(10); 
queue.enqueue(20); 
queue.enqueue(30); 
queue.enqueue(40); 
queue.enqueue(50); // Queue is now full 
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