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
    private ListNode middle(ListNode node){
        if(node == null || node.next == null) return node;
        ListNode slow = node;
        ListNode fast = node;
        while(fast.next != null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        return newHead;
    }
    private ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode(-1);
        ListNode tail = dummyHead;

       while(list1 != null && list2 != null){
       if (list1.val < list2.val){
        tail.next = list1;
        list1 = list1.next;
        tail = tail.next;
       } else {
        tail.next = list2;
        list2 = list2.next;
        tail = tail.next;
       }
       }
       if (list1 != null){
          tail.next = list1;
       } 
       if(list2 != null){
        tail.next = list2;
       }
       return dummyHead.next;
    }
    public ListNode sortList(ListNode head) {  
        if(head == null || head.next == null) return head;
        ListNode left = head;
        ListNode right = middle(head);
        ListNode leftHead = sortList(left);
        ListNode rightHead = sortList(right);
        return merge(leftHead, rightHead);
    } 
}