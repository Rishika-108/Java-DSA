package BinaryTree;

public class DiameterOfTree {
    // Diameter of The Tree - Number of Nodes in the longest path between any two nodes
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
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
         int diam1 = diameter(root.left);
         int diam2 = diameter(root.right);
         int diam3 = HeightOfNode(root.left) + HeightOfNode(root.right) + 1;

         return Math.max(Math.max(diam1, diam2), diam3);
    }
    // Second Approach
    static class TreeInfo  {
        int ht;
        int diam;
        TreeInfo (int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2 (Node root) {
        if (root == null) {
            return new TreeInfo(0,0);
            
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myheight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myheight, myDiam);
        return myInfo;
    }
    public static void main(String[] args) {
        int nodes[] =  {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        DiameterOfTree bt = new DiameterOfTree();
        Node root = bt.buildTree(nodes);
        System.out.println(HeightOfNode(root));
        System.out.println(diameter2(root).diam);
        
    }
}
