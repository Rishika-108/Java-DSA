class Solution {
    private boolean isUnderThreshold(int[] nums, int threshold, int mid){
        int sum = 0;
         for(int i = 0; i < nums.length; i++){
            sum += Math.ceil((double)nums[i]/mid);
         }
         return sum <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(isUnderThreshold(nums, threshold, mid)){
              ans = mid;
              high = mid - 1;
            } else {
              low = mid + 1;
            }
        }
        return ans;
    }
}