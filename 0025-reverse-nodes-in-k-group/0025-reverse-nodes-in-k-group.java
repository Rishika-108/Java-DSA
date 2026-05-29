/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode reverse(ListNode head){
        ListNode temp = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = temp;
            temp = curr;
            curr = nextNode;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1) return head;
        int count = 1;
        ListNode temp = head;
        while(count < k){
            if(temp == null) return head;
            count++;
            temp = temp.next;
        }
        if(temp == null) return head;
        ListNode nextNode = temp.next;
        temp.next = null;
        ListNode reversedNode = reverse(head);
        head.next = reverseKGroup(nextNode, k);
        return reversedNode;
    }
}