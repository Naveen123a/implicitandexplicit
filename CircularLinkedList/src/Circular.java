import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else if (data <= head.data) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class Circular {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(2);
        circularLinkedList.insert(4);
        circularLinkedList.insert(6);
        circularLinkedList.insert(8);

        System.out.print("Original Circular Linked List: ");
        circularLinkedList.display();
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter new data:");
        int newData = sc.nextInt();
        circularLinkedList.insert(newData);

        System.out.print("Circular Linked List after inserting " + newData + ": ");
        circularLinkedList.display();
    }
}
