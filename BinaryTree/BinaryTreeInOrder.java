package BinaryTree;

public class BinaryTreeInOrder {
    class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    int index = -1;
    public Node buildTree (int nodes[]) {
        index++;
        if (nodes[index] == -1) { // -1 indicates null node
            return null;
        }
        Node newNode = new Node(nodes[index]); // Create a new node with the current value
        newNode.left = buildTree(nodes); // Recursively build the left subtree
        newNode.right = buildTree(nodes); // Recursively build the right subtree
        return newNode;
    }

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data +  " ");
        InOrder(root.right);

    }
    public static void main(String[] args) {
        int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeInOrder bt = new BinaryTreeInOrder();
        Node root = bt.buildTree(nodes); // Build the binary tree from the given array
        InOrder (root);
    }
}
