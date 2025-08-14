package LinkedList;

public class DoublrCircularLL {
    Node head;
    class Node {
        Integer data;
        Node next;
        Node prev;
        Node (Integer data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    //ADD FIRST
    public void addFirst (Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }
        Node tail = head.prev; // Get the last node
        newNode.next = head; // Connects newNode to head
        newNode.prev = tail; // Connects newNode to the last node
        head.prev = newNode; // Connects head back to newNode
        tail.next = newNode; // Connects the last node to newNode
        head = newNode;

    }
    //ADD LAST
    public void addLast (Integer data) {
        Node newNode  = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
            return;
        }
        Node tail = head.prev; // Get the last node
        tail.next = newNode; // Connects the last node to newNode
        newNode.prev = tail; // Connects newNode back to the last node
        newNode.next = head; // Connects newNode to head
        head.prev = newNode; // Connects head back to newNode
    }
    // DELETE FIRST
    public void deleteFirst () {
        if (head == null) {
            System.out.println( "Linked List is empty");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node tail = head.prev;
        Node newHead = head.next;

        tail.next = newHead; // Connects the last node to the new head
        newHead.prev = tail; // Connects the new head back to the last node
        head = newHead;  // Sets the new head


    }
    //DELETE LAST
    public void deleteLast () {
         if (head == null) {
            System.out.println( "Linked List is Empty");
            return;
         }
         if (head.next == head) {
            head = null;
            return;
         }
         Node tail = head.prev;
         Node newTail = tail.prev;
        
         newTail.next = head; // Connects the new tail to head
         head.prev = newTail; // Connects the new tail back to head

         tail.next = null; // Disconnects the next pointer of tail
         tail.prev = null; // Disconnects the tail node

    }
    //ADD AT INDEX
    public void addAtIndex(int position, Integer data) {
    Node newNode = new Node(data);

    if (head == null) {
      
        newNode.next = newNode; // Points to itself
        newNode.prev = newNode; //Points to itself
        head = newNode;
        return;
    }

    if (position == 0) {
        Node tail = head.prev;

        newNode.next = head; // Adds node before the head
        newNode.prev = tail; // Connects the node from tail side

        tail.next = newNode; //Connects tail to newNode
        head.prev = newNode; //Connects head to newNode
        head = newNode;
        return;
    }

    Node current = head;
    int i = 0;

    while (i < position && current.next != head) {
        current = current.next;
        i++;
    }
    Node prevNode = current.prev;

    newNode.next = current; 
    newNode.prev = prevNode;
    prevNode.next = newNode;
    current.prev = newNode;
}

    //DELETE AT INDEX
   public void deleteAtIndex(int position) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // Only one node
    if (head.next == head && position == 0) {
        head = null;
        return;
    }

    // Delete head node
    if (position == 0) {
        Node tail = head.prev;
        head = head.next;
        head.prev = tail;
        tail.next = head;
        return;
    }

    Node current = head;
    int i = 0;

    // Traverse to the node at position
    while (i < position && current.next != head) {
        current = current.next;
        i++;
    }

    if (i != position) {
        System.out.println("Position out of bounds");
        return;
    }

    // Remove current node
    Node prevNode = current.prev;
    Node nextNode = current.next;

    prevNode.next = nextNode;
    nextNode.prev = prevNode;

    // If deleting the last node (which may be before head), nothing else needed
}


    //PRINT LIST
    public void printList () {
         if (head  == null) {
            System.out.println( "List is empty");
            return;
        }
        Node currNode = head; 
        Node tail = head.prev;
        while (currNode != tail) {
             System.out.print(currNode.data +  " <->");
            currNode = currNode.next;
        }
        System.out.println( "NULL");
    }
    
    public static void main(String[] args) {
        DoublrCircularLL ll = new DoublrCircularLL();
        ll.addFirst(2);
        ll.addLast(5);
        ll.addAtIndex(0, 10);
        ll.deleteAtIndex(0);
        ll.printList();

        
    }
}
