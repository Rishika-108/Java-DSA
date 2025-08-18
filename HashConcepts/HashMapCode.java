package HashConcepts;
import java.util.*;

public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of nodes
        private int N; // number of buckets
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; // initial number of buckets
            this.buckets = new LinkedList[4]; // initial size of buckets
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // initialize each bucket
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode(); // get the hash code of the key
            return Math.abs(bi) % N; // ensure non-negative index
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi]; // get the linked list at the bucket index
            for (int i = 0; i < ll.size(); i++) { // iterate through the linked list
                if (ll.get(i).key.equals(key)) { // check if the key matches
                    return i; // return the index if found
                }
            }
            return -1; // return -1 if the key is not found
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets; // store the old buckets
            buckets = new LinkedList[N * 2]; // create new buckets with double the size
            N = N * 2; // update the number of buckets
            n = 0;// reset the number of nodes

            for (int i = 0; i < N; i++) { // initialize new buckets
                buckets[i] = new LinkedList<>();// initialize each bucket
            }

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i]; // get the old linked list
                for (int j = 0; j < ll.size(); j++) { // iterate through the old linked list
                    Node node = ll.get(j); // get the node
                    put(node.key, node.value); // reinsert the node into the new buckets
                    // this will call the put method which will handle the rehashing
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // get the bucket index using the hash function
            int di = searchInLL(key, bi); // search for the key in the linked list at the bucket index
            // if di is -1, it means the key is not present in the map

            if (di == -1) {
                buckets[bi].add(new Node(key, value)); // add a new node with the key and value
                n++;
            } else {
                Node node = buckets[bi].get(di); // get the existing node
                node.value = value;// update the value of the existing node
            }

            double lambda = (double) n / N; // calculate the load factor
            if (lambda > 2.0) { // if the load factor exceeds 2.0, rehash the map
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di); // get the node at the index
                return node.value;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // get the bucket index using the hash function
            int di = searchInLL(key, bi); // search for the key in the linked list at the bucket index
            return di != -1; // return true if the key is found, false otherwise
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di); // remove the node at the index
                n--; // decrement the number of nodes
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) { // iterate through each bucket
                LinkedList<Node> ll = buckets[i]; // get the linked list at the bucket index
                for (int j = 0; j < ll.size(); j++) { // iterate through the linked list
                    Node node = ll.get(j);// get the node
                    keys.add(node.key);// add the key to the keys list
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        // Optional: ToString method to print the map
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (LinkedList<Node> bucket : buckets) { // iterate through each bucket
                for (Node node : bucket) { // iterate through each node in the bucket
                    sb.append(node.key).append("=").append(node.value).append(", "); // append key-value pairs to the string builder
                }
            }
            return "{" + (sb.length() > 1 ? sb.substring(0, sb.length() - 2) : "") + "}"; // return the string representation of the map
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 140);
        map.put("Japan", 40);
        System.out.println("Map: " + map);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) { // iterate through the keys
            String key = keys.get(i); // get the key from the keys list
            System.out.println(key + " -> " + map.get(key)); // print the key and its corresponding value
        }

        map.remove("India");
        System.out.println("After removing India: " + map.get("India")); // should print null
    }
}
