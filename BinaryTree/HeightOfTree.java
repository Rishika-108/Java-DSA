package BinaryTree;

public class HeightOfTree {
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

    public static int HeightOfNode (Node root) {
        if (root == null) {
            return 0;
        }
        int leftheight = HeightOfNode(root.left);
        int rightheight = HeightOfNode(root.right);

       int myHeight = Math.max(leftheight, rightheight) + 1;
       return myHeight;
    }
    public static void main(String[] args) {
        int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        HeightOfTree bt = new HeightOfTree();
        Node root = bt.buildTree(nodes);
        System.out.println(HeightOfNode(root));
        
    }
}
