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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;
        int sum = 0,carry = 0;

        while(temp1 != null || temp2 != null || carry > 0){
        int total = carry;
        if(temp1 != null){
            total += temp1.val;
            temp1 = temp1.next;
        }
        if(temp2!= null){
            total += temp2.val;
            temp2 = temp2.next;
        }
        carry = total/10;
        tail.next = new ListNode(total % 10);
        tail = tail.next;
        }
        return dummyHead.next;
    }
}