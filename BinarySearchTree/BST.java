package BinarySearchTree;

import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }
    // INSERT IN BST
    public static Node insert (Node root, int val) {
        if (root == null) {
          root = new Node(val);
          return root;
        }
        if (root.data  > val) {
            root.left = insert(root.left, val); // go to left subtree
        } else {
            root.right = insert(root.right, val); // go to right subtree
        }
        return root;
    }
    //PRINT THE INORDER SERIES - GIVES SORTED LIST
    public static void inOrder (Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data +  " ");
        inOrder(root.right);
    }
    //SEARCH A VALUE
    public static boolean search (Node root, int key) {
        if (root == null) {
            return false;
        }
        else if (root.data  > key) {
            return search(root.left, key);
        } 
        else if (root.data == key) {
             return true;
        }
       else {
            return search(root.right, key);
        }
    }
    //DELETE A NODE
    public static Node delete (Node root, int val) {
         if (root.data  > val) {
            root.left = delete(root.left, val);
         }
         else if (root.data  < val) {
            root.right = delete(root.right, val);
         }
         else { // root.data == val
             //Case 1
             if (root.left == null && root.right == null) { // leaf node
                return null;
             }

             //Case 2
             if (root.left == null) { // no left child
                return root.right;
             } else if(root.right == null) { // no right child 
                return root.left;
             }

             //Case 3
             Node IS = inOrderSuccessor(root.right); // find the inorder successor
             // replace the data of root with inorder successor
             root.data = IS.data;
             root.right = delete(root.right, IS.data); // delete the inorder successor  
         }
         return root;
    }
    public static Node inOrderSuccessor (Node root) {
        while (root.left != null) { // go to the leftmost node
            root = root.left;// traverse to the left
        }
        return root; // this is the inorder successor
    }
    public static void PrintInRange (Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data  >= x  && root.data <= y) { // if the value is in range
            PrintInRange(root.left, x, y);
            System.out.print(root.data +  " ");
            PrintInRange(root.right, x, y);
        } else if (root.data > y) { // if the value is greater than y, go to left subtree
            PrintInRange(root.left, x, y);
        } else {
            PrintInRange(root.right, x, y); // if the value is less than x, go to right subtree
        }
    }
    public static void RootToLeaf (Node root, ArrayList<Integer>path) {
        if (root == null) {
            return;
        }
        path.add (root.data);
        if (root.left == null  && root.right == null) { // if it is a leaf node
            printPath (path);
        } else  {
        
        RootToLeaf(root.left, path); // traverse to left subtree
        RootToLeaf(root.right, path); // traverse to right subtree
        }
        path.remove(path.size() - 1); // backtrack to remove the current node from the path
    }
    public static void printPath (ArrayList<Integer>path) {
      for (int i = 0; i  < path.size(); i++) { // print the path
        System.out.print(path.get(i) +  "->");
      }
      System.out.println();
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

        if (search(root, 1)) {
            System.out.println( "Found");
        } else {
            System.out.println( "Not Found");
        }

        delete(root, 4);
        inOrder(root);

        PrintInRange(root, 6, 10);
        RootToLeaf(root, new ArrayList<>()  );
    }
}
