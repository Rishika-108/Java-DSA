package Queue;

public class QueueUsingArray {
   
        int arr[];
        int size;
        int rear = -1;
        QueueUsingArray(int size) {
            arr = new int[size];
            this.size = size;
        }
        public boolean isEmpty() {
          return rear == -1;
        }

        public void enque (int data) {
           if (rear == size-1) { // Queue is full
             System.out.println( "Queue is filled");
             return;
           }
           rear++; // Increment rear
           arr[rear] = data;
        }

        public int deque() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0]; // Store the front element

            for (int i = 0; i < rear; i++) { 
                arr[i] = arr[i+1]; // Shift elements to the left
            }
            rear--; // Decrement rear as we removed the front element
            return front;

        }

        public int peek () {
            if (isEmpty()) {
                return -1;
            }
            return arr[0];
        }
        
    
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(3);
        q.enque(1);
        q.enque(2);
        q.enque(3);

        while ( !q.isEmpty()) {
            System.out.println(q.peek());
            q.deque();
        }
    }
}
