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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int count = 1;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        k = k % count;
        temp = head;
        int nthNode = 1;
        while(nthNode < count - k){
            nthNode++;
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        if(newHead == null) return head;
        temp.next = null;
        temp = newHead;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;

        return newHead;
    }
}