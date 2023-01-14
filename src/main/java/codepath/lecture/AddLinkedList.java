package codepath.lecture;

public class AddLinkedList {

    public static void main(String[] args) {
        Node head = new Node(6);
        Node nodeB = new Node(7);
        Node nodeC = new Node(8);
        Node nodeD = new Node(9);
        // Point to the nodes to each other
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
    }

    // Init a Linked List
    public static class Node {
        int data;
        Node next; // points to null by default

        Node(int data) {
            this.data = data;
        }
    }


    public static Node oddEvent(Node head) {
        if (head != null) {
            Node odd = head;
            Node even = head.next;
            Node evenhead = even;
            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next.next;
                even = even.next;
            }
            odd.next = even;
        }
        return head;
    }
}
