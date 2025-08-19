package Trie;

public class StartsWithProblem {
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
    public static  boolean startsWith (String prefix) {
      Node curr = root;
      for (int i = 0; i < prefix.length(); i++) { // Traverse the Trie for each character in the prefix
        int index = prefix.charAt(i) - 'a'; // Calculate index for the character
        if (curr.children[index] == null) { // If the child node does not exist, the prefix is not present
            return false; // Prefix not found
        }
        curr = curr.children[index]; // Move to the child node for the next character
      }
      return true;
    }

    public static void main(String[] args) {
        String words[] = {  "apple", "app", "mango", "woman" };
        String prefix = "app";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println (startsWith(prefix));
        
    }
}
