package LinkedListProblems;

public class IsPalindromLinkedList {
    public static ListNode findMid(ListNode head){

        ListNode slow=head;
        ListNode fast=head;

        while (fast !=null && fast.next != null) {
            slow = slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }
     public static boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null){
            return true;
        }

        ListNode mid = findMid(head);

        ListNode prev=null;
        ListNode curr = mid;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode rigth = prev;
        ListNode left = head;

        while (rigth != null) {

            if(left.val != rigth.val){
                return false;
            }

            left=left.next;
            rigth=rigth.next;
            
        }
        return true;
    }
}
  class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
