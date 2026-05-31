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

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

        return head;
    }

    public static Node reverseBetween(Node head, int left, int right) {

        if (head == null || left == right)
            return head;
        Node temp = head;

        int count = 1;
        Node tempHead = null;
        Node tempTail = null;
        Node prevLeft = null;
        Node nextRigth = null;
        Node prev = null;
        while (temp != null) {

            if (count == left) {
                tempHead = temp;
                prevLeft = prev;
            }

            if (count == right && temp.next != null) {
                tempTail = temp;
                nextRigth = temp.next;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }
        tempTail.next = null;
      
        Node newHead = reverseList(tempHead);

        if (prevLeft != null) {
            prevLeft.next = newHead;
        } else {
            head = newHead;
        }

        tempHead.next = nextRigth;
        return head;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        reverseBetween(head, 2, 4);
        ll.print(head);

    }
}
