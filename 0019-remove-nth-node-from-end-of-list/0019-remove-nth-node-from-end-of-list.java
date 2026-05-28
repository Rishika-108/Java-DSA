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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        if(head == null || head.next == null) return null;
        while(temp != null){
            count++;
            temp = temp.next;
        } 
        if(n == count) return head.next;

        int nthNode = 1;
        temp = head;
        while(nthNode < count - n){
            nthNode++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}