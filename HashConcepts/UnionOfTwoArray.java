package HashConcepts;

import java.util.HashSet;

public class UnionOfTwoArray {
    public static int union (int arr1[], int arr2[]) {
        HashSet <Integer > set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]); // Add elements from the first array
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]); // Add elements from the second array
        }
        return set.size(); // Return the size of the set, which is the count of unique elements
    }
    public static void main(String[] args) {
        int arr1[] =  {7,3,9};
        int arr2[] =  {6,3,9,2,4};
        System.out.println((union(arr1, arr2)));
    }
}
