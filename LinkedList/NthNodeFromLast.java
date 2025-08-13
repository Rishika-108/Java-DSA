package LinkedList;

public class NthNodeFromLast {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 1;
        ListNode curr = head;
        while (curr  != null) {
            curr = curr.next;
            size ++;
        }
        if (n == size) {
            return head.next;
        }

        int indexToSearch = size-n;
        ListNode prev = head;
        int i = 0;
        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

}
