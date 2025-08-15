package Stack;

import java.util.Stack;

public class PushAtBottomOfStack {
    public static void pushAtBottom (Integer data, Stack <Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop(); // Store the top element
        pushAtBottom(data, s); // Recursively call pushAtBottom to reach the bottom of the stack
        // Push the stored top element back onto the stack
        s.push(top);
        
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack <> ();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom (4, s);
        while ( !s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
