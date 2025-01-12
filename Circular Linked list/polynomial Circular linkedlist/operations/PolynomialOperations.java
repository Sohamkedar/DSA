package polynomial.operations;

import java.util.Scanner;

class Node {
    int coefficient;
    int exponent;
    Node next;

    Node(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    // Insert a new term in the polynomial
    void insert(int coefficient, int exponent) {
        Node newNode = new Node(coefficient, exponent);
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

    // Display the polynomial
    void display() {
        if (head == null) {
            System.out.println("Polynomial is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.coefficient + "x^" + current.exponent);
            current = current.next;
            if (current != head) {
                System.out.print(" + ");
            }
        } while (current != head);
        System.out.println();
    }

    // Add two polynomials
    CircularLinkedList add(CircularLinkedList other) {
        CircularLinkedList result = new CircularLinkedList();

        // If this list or the other list is empty, return a copy of the non-empty list
        if (this.head == null) return other;
        if (other.head == null) return this;

        Node p1 = this.head;
        Node p2 = other.head;

        // Copy all nodes from the first polynomial to the result
        do {
            result.insert(p1.coefficient, p1.exponent);
            p1 = p1.next;
        } while (p1 != this.head);

        // Copy nodes from the second polynomial, adding coefficients where exponents match
        do {
            Node current = result.head;
            boolean added = false;

            do {
                if (current.exponent == p2.exponent) {
                    current.coefficient += p2.coefficient;
                    added = true;
                    break;
                }
                current = current.next;
            } while (current != result.head);

            // If there was no matching exponent in the result, insert the new term
            if (!added) {
                result.insert(p2.coefficient, p2.exponent);
            }
            p2 = p2.next;
        } while (p2 != other.head);

        return result;
    }

    // Evaluate the polynomial at a given value of x
    int evaluate(int x) {
        int result = 0;
        Node current = head;
        do {
            result += current.coefficient * Math.pow(x, current.exponent);
            current = current.next;
        } while (current != head);
        return result;
    }
}

public class PolynomialOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList poly1 = new CircularLinkedList();
        CircularLinkedList poly2 = new CircularLinkedList();
        CircularLinkedList result;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert term in Polynomial 1");
            System.out.println("2. Insert term in Polynomial 2");
            System.out.println("3. Display Polynomial 1");
            System.out.println("4. Display Polynomial 2");
            System.out.println("5. Add Polynomials");
            System.out.println("6. Evaluate Polynomial 1");
            System.out.println("7. Evaluate Polynomial 2");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter coefficient: ");
                    int coeff1 = scanner.nextInt();
                    System.out.print("Enter exponent: ");
                    int expo1 = scanner.nextInt();
                    poly1.insert(coeff1, expo1);
                    break;
                case 2:
                    System.out.print("Enter coefficient: ");
                    int coeff2 = scanner.nextInt();
                    System.out.print("Enter exponent: ");
                    int expo2 = scanner.nextInt();
                    poly2.insert(coeff2, expo2);
                    break;
                case 3:
                    System.out.print("Polynomial 1: ");
                    poly1.display();
                    break;
                case 4:
                    System.out.print("Polynomial 2: ");
                    poly2.display();
                    break;
                case 5:
                    result = poly1.add(poly2);
                    System.out.print("Resultant Polynomial: ");
                    result.display();
                    break;
                case 6:
                    System.out.print("Enter value of x for Polynomial 1: ");
                    int x1 = scanner.nextInt();
                    System.out.println("Result: " + poly1.evaluate(x1));
                    break;
                case 7:
                    System.out.print("Enter value of x for Polynomial 2: ");
                    int x2 = scanner.nextInt();
                    System.out.println("Result: " + poly2.evaluate(x2));
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
