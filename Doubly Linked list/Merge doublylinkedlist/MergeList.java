package doublylinkedlist; 
 
public class MergeList { 
 public static Node merge(Node head1, Node head2) { 
        if (head1 == null) return head2; 
        if (head2 == null) return head1; 
 
        if (head1.data <= head2.data) { 
            head1.next = merge(head1.next, head2); 
            if (head1.next != null) head1.next.prev = 
head1; 
            head1.prev = null; 
            return head1; 
        } else { 
            head2.next = merge(head1, head2.next); 
            if (head2.next != null) head2.next.prev = 
head2; 
            head2.prev = null; 
            return head2; 
        } 
    } 
 
    public static void main(String[] args) { 
        DoublyLinkedList list1 = new DoublyLinkedList(); 
        list1.insert(3); 
list1.insert(1); 
list1.insert(4); 
list1.sort(); 
System.out.print("List 1: "); 
list1.display(); 
DoublyLinkedList list2 = new DoublyLinkedList(); 
list2.insert(2); 
list2.insert(5); 
list2.insert(6); 
list2.sort(); 
System.out.print("List 2: "); 
list2.display(); 
Node mergedHead = merge(list1.head, list2.head); 
DoublyLinkedList mergedList = new 
DoublyLinkedList(); 
mergedList.head = mergedHead; 
System.out.print("Merged List: "); 
mergedList.display(); 
} 
}