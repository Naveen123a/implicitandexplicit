import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
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

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteFirstOccurrence(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node current = head.next;

        while (current != null) {
            if (current.data == key) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(5);
        linkedList.insert(10);
        linkedList.insert(15);
        linkedList.insert(20);

        System.out.print("Original Linked List: ");
        linkedList.display();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to delete:");
        int key = sc.nextInt();
        linkedList.deleteFirstOccurrence(key);

        System.out.print("Linked List after deleting first occurrence of " + key + ": ");
        linkedList.display();
    }
}
