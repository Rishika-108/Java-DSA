class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0;
        int n = nums.length;
        int left = 0;

        for(int right = 0; right < n; right++){
            if(nums[right] == 0){
                k--;
            } 
            while(k < 0){
                if(nums[right] == 0){
                    if(nums[left] == 0){
                        k++;
                    }
                    left++;
                }
            }
            maxOnes = Math.max(maxOnes, right - left + 1);
        }
        return maxOnes;
    }
}