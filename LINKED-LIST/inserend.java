public class inserend {

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

        // Insert 40 at end
        Node newNode = new Node(40);

        Node current = first;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        // Traverse
        current = first;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}