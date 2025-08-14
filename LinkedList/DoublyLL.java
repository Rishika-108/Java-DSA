package LinkedList;


public class DoublyLL {
    Node head;

    class Node {
        Integer data;
        Node next;
        Node prev;

        Node(Integer data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // ADD FIRST
    public void addFirst(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head; // Connects newNode to head in the beginning
        head.prev = newNode; // Connects head back to the newNode
        head = newNode; // Sets newNode as head
    }

    // ADD LAST
    public void addLast(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode; // Sets the newNode after the currentNode
        newNode.prev = currNode; // Connects the newNode back to currentNode
        newNode.next = null;// Not necessary
    }

    // DELETE FIRST
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        head = head.next; // Moves head to next pointer
        if (head != null) {
            head.prev = null; // Deletes the backlink to old head
        }
    }

    // DELETE LAST
    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null; // Disconnects the last node
        currNode.next.prev = null; // Disconnects the backlink of the last node
    }

    // ADD AT POSITION
    public void addAtPosition(int position, Integer data) {
        Node newNode = new Node(data);
        if (head == null || position == 0) {
            newNode.next = head; // Connects newNode to head
            if (head != null) {
                head.prev = newNode;// Connects newNode to head
            }
            head = newNode;
            return;
        }
        Node currNode = head;
        int i = 0;
        while (currNode != null && i < position) {
            currNode = currNode.next;
            i++;
        }
        if (currNode == null) {
            Node last = head;
            while (last.next != null) { // Finds the last node
                last = last.next; // Traverses to the last node
            }
            last.next = newNode; // Sets newNode as the last node
            newNode.prev = last; // Connects newNode back to last node
        } else {
            Node prevNode = currNode.prev; // Finds the previous node
            newNode.next = currNode;  // Connects newNode to current node
            currNode.prev = newNode;  // Connects current node back to newNode
            prevNode.next = newNode;  // // Connects previous node to newNode
            newNode.prev = prevNode;  // Connects newNode back to previous node
            
        }

    }
    // DELETE AT POSITION
    public void DeleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        if (position == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node currNode = head;
        int i = 0;
        while (i < position && currNode != null) {
            currNode = currNode.next;
            i++;
        }
        if (currNode == null) {
            System.out.println("Position out of bounds");
        }

        Node prevNode = currNode.prev; // Finds the previous node
        Node nextNode = currNode.next; // Finds the next node

        if (prevNode != null) // Checks if there is a previous node
            prevNode.next = nextNode; // Connects previous node to next node
        if (nextNode != null) // Checks if there is a next node
            nextNode.prev = prevNode; // Connects next node back to previous node
 
        currNode.next = null; // Disconnects the next pointer of current node
        currNode.prev = null; // Disconnects the previous pointer of current node

    }

    public void printList() {
         if (head  == null) {
            System.out.println( "List is empty");
            return;
        }
        Node currNode = head; 
        while (currNode != null) {
             System.out.print(currNode.data +  "<->");
            currNode = currNode.next;
        }
        System.out.println( "NULL");
    }


    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(2);
        ll.addLast(3);
        ll.addAtPosition(1, 10);
        ll.DeleteAtPosition(1);
        ll.printList();

    }
}
