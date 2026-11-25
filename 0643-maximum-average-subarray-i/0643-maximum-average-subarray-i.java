class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0, count = 0, right = 0;
        double average = Double.NEGATIVE_INFINITY;
        double maxAverage = Double.NEGATIVE_INFINITY, sum = 0;

        if(nums.length <= 1) return nums[0];

        while(left <= right && right < nums.length){
           sum += nums[right];
           count++;
           right++;
          
           if(count > k){
            count--;
            sum -= nums[left];
            left++;
           }
           
           if (count == k) {
             average = sum / k;
             maxAverage = Math.max(average, maxAverage);
           }
        }
        return maxAverage;
    }
}