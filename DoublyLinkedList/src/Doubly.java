class Node {
    int data;
    Node previous;
    Node next;

    public Node(int data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
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
            newNode.previous = current;
        }
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }
}

public class Doubly {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(2);
        doublyLinkedList.insert(4);
        doublyLinkedList.insert(6);
        doublyLinkedList.insert(8);

        System.out.print("Forward traversal: ");
        doublyLinkedList.displayForward();

        System.out.print("Backward traversal: ");
        doublyLinkedList.displayBackward();
    }
}
