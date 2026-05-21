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
    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head =tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void removeFirst(){

        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;

    }
    public void removeLast(){
        
    }
    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        
        ll.addFirst(0);
        ll.removeFirst();
        ll.removeFirst();
        ll.print(head);
    }
}
