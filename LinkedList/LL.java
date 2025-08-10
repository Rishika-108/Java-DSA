package LinkedList;

class LL {
    Node head;
    private int size;

    LL () {
        this.size = 0;
    }
    class Node {
        String data;
        Node next;
        Node (String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //ADD - FIRST
    public void addFirst (String data) {
        Node newNode = new Node (data);
        if (head == null) { // To check whether head is null
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //ADD - LAST
    public void addLast (String data)  {
        Node newNode = new Node (data);
        if (head == null) { // To check whether head is null
            head = newNode;
            return;
        }
        Node currNode = head; //temporary variable that stores the value of head
        while (currNode.next  != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;// add last
    }
    //ADD AT PARTICULAR INDEX
    public void addAtIndex (int index, String data) {
        if (index > size || index < 0  ) {
            System.out.println( "Invalid Index");
        }
        size++;
        Node newNode = new Node (data);
        if (head == null) { // To check whether head is null
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }

    }
    //DELETE - FIRST
    public void deleteFirst () {
        if (head == null) {
            System.out.println( "The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //DELETE LAST
    public void deleteLast () {
        if (head == null) {
            System.out.println( "The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    //RETURN SIZE
    public int getSize () {
        return size;
    }

    //PRINT LIST
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
        LL list = new LL();

        list.addFirst( "a");
        list.addFirst( "is");
        list.printList();

        list.addFirst( "This");
        list.addLast( "list");
        list.printList();
        list.addAtIndex(2,  "test");

        list.deleteFirst();;
        list.printList();

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
