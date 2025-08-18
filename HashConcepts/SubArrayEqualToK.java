package HashConcepts;

import java.util.HashMap;

public class SubArrayEqualToK {
    public static void main(String[] args) {
        int arr[] =  {10,2,-2,-20,10};
        int k = -10; // target sum
        // Using HashMap to store the cumulative sum and its frequency
        HashMap <Integer, Integer > map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 to handle cases where subarray starts from index 0
        int ans = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) { // iterate through the array
            sum  += arr[j];// update the cumulative sum
            // Check if there is a subarray with sum equal to k
            if (map.containsKey(sum - k)) { // if the difference (sum - k) exists in the map
                // it means there are subarrays ending at index j with sum equal to k
                ans += map.get(sum-k); // increment the count of such subarrays
            }
            if (map.containsKey(sum)) { // if the cumulative sum already exists in the map
                // increment its frequency
                map.put(sum, map.get(sum) + 1);// increment the count of this cumulative sum
            } else {
                map.put(sum, 1);// else add it with frequency 1
            }
        }
        System.out.println(ans);
    }
}
