/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        if(headA == headB) return headA;
        ListNode slow = headA;
        ListNode fast = headB;
        int count1 = 0, count2 = 0;
        while(slow != null){
            count1++;
            slow = slow.next;
        } 
        while(fast != null){
            count2++;
            fast = fast.next;
        }
        slow = headA;
        fast = headB;
        if(count1 < count2){
         int diff = count2 - count1;
          while(diff != 0){
               fast = fast.next;
               diff--;
            }
            while(slow != null && fast != null){
            if(slow == fast) return slow;
            slow = slow.next;
            fast = fast.next;
            }

        } else if (count1 > count2) {
            int diff = count1 - count2;
            while(diff != 0){
               slow = slow.next;
               diff--;
            }
            while(slow != null && fast != null){
            if(slow == fast) return slow;
            slow = slow.next;
            fast = fast.next;
            }
        } else {
            while(slow != null && fast != null){
            if(slow == fast) return slow;
            slow = slow.next;
            fast = fast.next;
            }
        }

        return null;
    }
}