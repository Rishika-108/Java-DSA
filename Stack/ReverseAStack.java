package Stack;

import java.util.Stack;

public class ReverseAStack {
    public static void pushAtBottom (int data, Stack <Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop(); // Store the top element
        // Recursively call pushAtBottom to reach the bottom of the stack
        pushAtBottom(data, s);
        s.push(top); // Push the stored top element back onto the stack
        // This effectively places the new data at the bottom of the stack
    }
    public static void reverse (Stack <Integer >s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop(); // Store the top element
        // Recursively call reverse to reverse the remaining stack
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack <Integer > s = new Stack <> ();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while ( !s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
