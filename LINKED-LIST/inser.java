

public class inser {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        // Insert 5 at beginning
        Node newNode = new Node(5);

        newNode.next = first;
        first = newNode;

        // Traverse
        Node current = first;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
