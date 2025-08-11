package LinkedList;

public class ReverseIterativeMethod {
    Node head;
    class Node {
        Integer data;
        Node next;
        Node (Integer data) {
            this.data = data;
            this.next = null;
        }
    }
    // ADD
    public void addFirst (Integer data) {
        Node newNode = new Node (data);
        if (head == null) { // To check whether head is null
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //REVERSE
    public void Reverse () {
        Node prevNode = head;
        Node currentNode = head.next;
        if (head == null || head.next == null) {
            return;
        }

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            //update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    //PRINT
     public void printList () {
        if (head  == null) {
            System.out.println( "List is empty");
            return;
        }
        Node currNode = head; 
        while (currNode != null) {
             System.out.print(currNode.data +  "->");
            currNode = currNode.next;
        }
        System.out.println( "NULL");
    }
    public static void main(String[] args) {
        ReverseIterativeMethod RIM = new ReverseIterativeMethod();
        RIM.addFirst(1);
        RIM.addFirst(2);
        RIM.addFirst(3);
        RIM.addFirst(4);
        RIM.printList();
        RIM.Reverse();
        RIM.printList();
    }
}
