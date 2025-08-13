package LinkedList;

import LinkedList.IsLinkedListAPalindrome.ListNode;

public class LoopInLinkedList {
    //Floyd Algorithm of Detecting Loops - Also Called Hare Turtle Method
      // Hare and Turtle Approach - Turtle jumps one step, Hare jumps two step. When hare reaches 
      // the end, and turtle reaches the middle.
      public boolean hasCycle (ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (hare == turtle) {
                return true;
            }
        }
        return false;
      }
}
