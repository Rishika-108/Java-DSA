package LinkedList;

public class ReverseRecursiveMethod {
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
    public Node Reverse (Node head) {
        if (head == null || head.next == null) {
            return head;
        }
         Node newHead = Reverse(head.next);
         head.next.next = head;
         head.next = null;
         return newHead;

    }
    public static void main(String[] args) {
        ReverseRecursiveMethod RRM = new ReverseRecursiveMethod();
        RRM.addFirst(4);
        RRM.addFirst(3);
        RRM.addFirst(2);
        RRM.addFirst(1);
        RRM.printList();
        RRM.head = RRM.Reverse(RRM.head);
        RRM.printList();
        
    }
}
