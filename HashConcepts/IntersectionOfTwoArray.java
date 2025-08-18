package HashConcepts;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static int intersection (int arr1[], int arr2[]) {
        HashSet  <Integer> set = new HashSet<>();
        int count = 0; // to count the number of intersections
         for (int i = 0; i <arr1.length; i++) {
             set.add(arr1[i]); // add elements of arr1 to the set
         }
         for (int j = 0; j < arr2.length; j++) {
             if (set.contains(arr2[j])) { // check if arr2 elements are in the set
                // if yes, then it is an intersection
                count++;
                set.remove(arr2[j]); // remove to avoid counting duplicates
             }
         }
         return count++; // return the count of intersections
    }
    public static void main(String[] args) {
         int arr1[] =  {7,3,9};
        int arr2[] =  {6,3,9,2,4};
        System.out.println(intersection(arr1, arr2));
    }
}
