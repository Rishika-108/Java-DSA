package BinaryTree;

public class SubTreeOfTree {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode (int data) {
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }
    public boolean isIdentical (TreeNode root, TreeNode subRoot) {
      if (root == null  && subRoot == null) {
        return true;
      }
      if (root == null || subRoot == null ) {
        return false;
      }
       if (root.data == subRoot.data) {
      return isIdentical(root.left, subRoot.left)  && isIdentical(root.right, subRoot.right);
       }
       return false;
    }
    public boolean isSubtree (TreeNode root, TreeNode subRoot) {
        
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
