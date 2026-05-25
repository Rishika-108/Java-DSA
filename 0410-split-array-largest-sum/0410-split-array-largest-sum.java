class Solution {
    private boolean subArray(int[] nums, int k, int mid){
        int count = 1, sum = 0;
        for(int num: nums){
            if(sum + num <= mid){
                sum += num;
            } else {
                 count++;
                 sum = 0;
                 sum += num;
            }
        }
        return count<=k;
        
    }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(subArray(nums, k, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}