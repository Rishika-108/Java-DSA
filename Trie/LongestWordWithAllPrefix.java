package Trie;

public class LongestWordWithAllPrefix {
    static class Node {
        Node[] children;
        boolean eow;// End of word

        public Node() {
            children = new Node[26]; // Assuming only lowercase letters a-z
            // Initialize all children to null
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false; // End of word flag
        }
    }

    static Node root = new Node(); // Root of the Trie
    // Insertion in Trie

    public static void insert(String word) {
        Node curr = root; // Start from the root node
        for (int i = 0; i < word.length(); i++) { // Traverse the Trie for each character in the word
            int index = word.charAt(i) - 'a'; // Calculate index for the character

            if (curr.children[index] == null) { // If the child node does not exist, create a new node
                curr.children[index] = new Node(); // Create a new node for the character
            }
            if (i == word.length() - 1) { // If it's the last character of the word, mark it as end of word
                curr.children[index].eow = true; // Set end of word flag to true
            }
            curr = curr.children[index]; // Move to the child node for the next character
        }
        curr.eow = true; // Mark the end of the word
    }

    // Search in Trie
    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) { // Traverse the Trie for each character in the key
            int index = key.charAt(i) - 'a'; // Calculate index for the character
            if (curr.children[index] == null) { // If the child node does not exist, the word is not present
                return false; // Word not found
            }
            if (i == key.length() - 1 && curr.children[index].eow == false) { // If it's the last character
                // of the key and it's not marked as end of word, return false
                return false;
            }
            curr = curr.children[index]; // Move to the child node for the next character
        }
        return true; // Word found
    }
    public static String ans =  "";
    public static void longestwORD (Node root, StringBuilder temporary) {
         if (root == null) {
            return;
         }
         for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) { // If the child node exists and is marked as end of word
                temporary.append( (char)(i+'a')); // Append the character to the temporary string
                // Check if the current temporary string is longer than the previously found longest word
                if (temporary.length() > ans.length()) {
                    ans = temporary.toString(); // Update the longest word found so far
                }
                longestwORD(root.children[i], temporary); // Recursively call for the child node
                temporary.deleteCharAt(temporary.length() - 1); // Backtrack by removing the last character added to the temporary string
            }
         }
    }

    public static void main(String[] args) {
        String words[] =  { "a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestwORD(root, new StringBuilder(""));
        System.out.println (ans);
        
    }
}

