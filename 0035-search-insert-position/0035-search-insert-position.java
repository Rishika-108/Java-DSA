class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1;
        int ans = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] >= target){
                high = mid-1;
                ans = mid;
            } else { 
                low = mid + 1;
                ans = low;
            }
        }
        return ans;
    }
}