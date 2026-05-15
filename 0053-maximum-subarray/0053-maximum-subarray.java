class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int maxSum = nums[0];
        if(n <= 1) return nums[0];
            for(int j = 1; j < n; j++){
               // to avoid negative no 
               sum = Math.max(nums[j], sum+nums[j]); 
               maxSum = Math.max(maxSum, sum);
            }
        return maxSum;
    }
}