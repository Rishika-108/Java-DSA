package BinaryTree;


public class CountNode {
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
         if (nodes[index] == -1) {
            return null;
         }
         Node newNode = new Node(nodes[index]);
         newNode.left = buildTree(nodes);
         newNode.right = buildTree(nodes);
         return newNode;
    }

    public static int CountOfNode (Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = CountOfNode(root.left);
        int rightNode = CountOfNode(root.right);

        return leftNode + rightNode + 1;
    }
    public static void main(String[] args) {
        int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        CountNode bt = new CountNode();
        Node root = bt.buildTree(nodes);
        System.out.println( CountOfNode(root));
        
    }
}
