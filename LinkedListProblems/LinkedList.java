package LinkedListProblems;

public class LinkedList {

    public static Node head;
    public static Node tail;

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void removeFirst() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;

    }

    public void removeLast() {

    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }

    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (k > size)
            k %= size;

        for (int i = 0; i < k; i++) {

            Node tem = head;

            Node prev = null;
            while (tem.next != null) {

                prev = tem;
                tem = tem.next;
            }
            prev.next = null;
            tem.next = head;
            head = tem;

        }

        return head;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        rotateRight(head, 2);
        ll.print(head);

    }
}
