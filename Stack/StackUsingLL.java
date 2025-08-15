package Stack;

public class StackUsingLL {
     class Node {
        int data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }
        public Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(Integer data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        public int  pop () {
            int top = head.data;
            if (isEmpty()) {
                System.out.println( "Linked List is Empty");
                return -1;
            }
            head = head.next;
            return top;
        }

        public int peek () {
            int top = head.data;
            if (isEmpty()) {
                return -1;
            }
            return top;
        }
    

    public static void main(String[] args) {
        StackUsingLL s = new StackUsingLL();
        s.push (1);
        s.push(2);
        s.push(3);

        while ( !s.isEmpty()) {
            System.out.println(s.peek());
            s.pop ();
        }

    }
}
