class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        Arrays.fill(result, -1);
        int n = nums.length;
        if(n == 0) return new int[]{-1, -1};
        //First Occurence
        int low = 0, high = n-1;
        while(low<= high){
            int mid = (high + low)/2;
            if(nums[mid] >= target){
                high = mid-1;
                if(nums[mid] == target) result[0] = mid; 
            } else{
                low = mid+1;
            }
        }
        //Last Occurence
        low = 0;
        high = n-1;
        while(low<= high){
            int mid = (high + low)/2;
            if(nums[mid] <= target){
                low = mid+1;
                if(nums[mid] == target) result[1] = mid;
            } else{
                high = mid-1;
            }
        }
        return result;
    }
}