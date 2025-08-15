package Queue;

public class CircularQueueUsingArray {
    int arr[];
    int size;
    int rear = -1;
    int front = -1;

    CircularQueueUsingArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1; // Both rear and front are -1 when the queue is empty
    }

    public boolean isFull() {
        return (rear + 1) % size == front; // If the next position of rear is front, then the queue is full
    }

    public void enque(int data) {
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }
        if (front == -1) { // No element is present in The queue
            front = 0;
        }
        rear =  (rear + 1 ) % size; // Circular increment of rear
        arr[rear] = data; // Store the data at the rear position
    }

    public int deque() {
        if (isEmpty()) {
            return -1;
        }
        int result = arr[front];

        if (rear == front) { // If there is only one element in the queue
            // Reset the queue
            rear = front = -1;
        } else {
            front = (front + 1) % size; //
        }
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircularQueueUsingArray q = new CircularQueueUsingArray(3);
        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.deque();
        // System.out.println(q.deque());
        q.enque(4);
        

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.deque();
        }
    }

}
