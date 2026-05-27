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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        // Find the middle of LL;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse from middle
        ListNode curr = slow.next;
        ListNode temp = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = temp;
            temp = curr;
            curr = nextNode;
        }
         //Compare val of both the list
        ListNode firsthalf = head;
        ListNode secondHalf = temp;
        // Check if both are equal or not
        while(secondHalf != null){
            if(firsthalf.val != secondHalf.val) return false;
            firsthalf = firsthalf.next;
            secondHalf = secondHalf.next;
        }
      
      return true;
    }
}