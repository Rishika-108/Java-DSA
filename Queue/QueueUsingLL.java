package Queue;

public class QueueUsingLL {
    class Node {
        int data;
        Node next;

        Node (Integer data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public boolean isEmpty () {
        return head == null  && tail == null;
    }

    public void enque (int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int deque() {
       if (isEmpty()) {
        return -1;
       }
       if (head == tail) {
        tail = null;
       }
       int front = head.data;
       head = head.next;
       return front;
    }

    public int peek () {
        if (isEmpty()) {
            System.out.println( "Empty Queue");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.deque();

        while ( !q.isEmpty()) {
            System.out.println(q.peek());
            q.deque();
        }
    }
}
