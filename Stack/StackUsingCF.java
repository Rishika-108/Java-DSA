package Stack;

import java.util.Stack;

public class StackUsingCF {
    public static void main(String[] args) {
        Stack <Integer > list = new Stack<Integer>();
        list.push(2);
        list.push(3);
        while ( !list.isEmpty()) {
            System.out.println(list.peek());
            list.pop();
        }
    }
    
    
}
