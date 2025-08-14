package LinkedList;

public class SingleCircularLL {
    Node head;

    class Node { // Creates a Node for a linkedList
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }

    // ADD FIRST
    public void addFirst(Integer data) {
        Node newNode = new Node(data);
        if (head == null) { // If LL is empty
            newNode.next = newNode; // Creates a circular pointer that points towards itself
            head = newNode; // Make the first added node as head
            return;
        } else {
            Node currNode = head; // CurrNode is a temporary variable that stores value of head
            while (currNode.next != head) { // Transverse the list until we reach the last node
                currNode = currNode.next; // Moves to the next node
            }
            newNode.next = head; // Joins the newNode before head
            currNode.next = newNode; // Joins the last node to the newNode
            head = newNode; // Makes newNode as head

        }
    }

    // ADD LAST
    public void addLast(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        } else {
            Node currNode = head;
            while (currNode.next != head) {
                currNode = currNode.next;
            }
            currNode.next = newNode; // Connects the last node to newNode
            newNode.next = head; // Connects newNode to head

        }
    }

    // DELETE FIRST
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        } else if (head.next == head) { // If there is only one node
            head = null; // Makes head null i.e. deletes the only node
            return;
        } else {
            Node currNode = head;
            while (currNode.next != head) {
                currNode = currNode.next;
            }
            currNode.next = head.next; // Connects the last node to the second node
            head = head.next; // Moves head to the second node
        }
    }

    // DELETE LAST
    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else if (head.next == head) {
            head = null;
            return;
        } else {
            Node currNode = head;
            while (currNode.next.next != head) {
                currNode = currNode.next;
            }
            currNode.next = head; // Connects secondlast Node to head, thereby deleting the last node

        }
    }

    // ADD AT POSITION
    public void addAtPosition(int position, Integer data) {
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty
            newNode.next = newNode;
            head = newNode;
            return;
        }
        if (position == 0) { // If position is 0, add at the beginning
            Node currNode = head;
            while (currNode.next != head) {
                currNode = currNode.next;
            }
            newNode.next = head;
            currNode.next = newNode;
            head = newNode;
            return;
        }
        Node currNode = head;
        int i = 0;
        while (i < position && currNode.next != head) { // Traverse to the position
            currNode = currNode.next;
            i++;
        }
        Node nextNode = currNode.next; // Store the next node
        currNode.next = newNode;// Connects the current node to newNode
        newNode.next = nextNode; // Connects newNode to the next node
    }

    // DELETE AT POSITION
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        if (position == 0) { // If position is 0, delete the first node
            if (head.next == head) { // If there is only one node
                head = null;
            } else {

                Node currNode = head;
                while (currNode.next != head) {
                    currNode = currNode.next;
                }
                head = head.next; // Moves head to the second node
                currNode.next = head; // Connects the last node to the new head
            }
            return;
        }
        Node currNode = head;
        int i = 0;
        while (i < position && currNode.next != head) {
            currNode = currNode.next;
            i++;
        }
        if (currNode.next == head) { // If position is out of bounds
            System.out.println("position is out of bounds");
        }
        currNode.next = currNode.next.next; // Connects the current node to the node after the one to be deleted
    }


    // PRINT LIST
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node currNode = head;
        do {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        } while (currNode != head);
        System.out.println("NULL");
    }



    public static void main(String[] args) {
        SingleCircularLL ll = new SingleCircularLL();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addAtPosition(1, 10);
        ll.deleteAtPosition(1);
        ll.printList();
    }
}
