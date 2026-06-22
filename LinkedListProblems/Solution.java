package LinkedListProblems;



class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode h1 = l1;
        ListNode h2 = l2;

        while (h1 != null && h2 != null) {

            if (h1.val <= h2.val) {
                temp.next = h1;
                temp = temp.next;
                h1 = h1.next;
            } else {
                temp.next = h2;
                temp = temp.next;
                h2 = h2.next;
            }

        }
        while (h1 != null) {
            temp.next = h1;
            temp = temp.next;
            h1 = h1.next;

        }
        while (h2 != null) {
            temp.next = h2;
            temp = temp.next;
            h2 = h2.next;
        }

        return dummy.next;
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);

        ListNode lf = left;
        ListNode ri = right;
        ListNode temp = head;

        while (temp != null) {

            ListNode saved = temp.next;
            temp.next=null;

            if (temp.val < x) {
                lf.next = temp;
                lf = lf.next;

            } else {
                ri.next = temp;
                ri = ri.next;
            }

            temp = saved;

        }
        ListNode res = new ListNode(-1);
        ListNode temp2 = res;

        left = left.next;
        while (left != null) {
            temp2.next = left;
            temp2 = temp2.next;
            left = left.next;

        }
        right = right.next;
        while (right != null) {
            temp2.next = right;
            temp2 = temp2.next;
            right = right.next;

        }
        return res.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {

        ListNode merged = null;
        for (ListNode list : lists) {
            merged = merge(list, merged);
        }
        return merged;
    }

}
