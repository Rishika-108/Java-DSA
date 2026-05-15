class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int posIndex = 0, negIndex = 1;

        int i = 0;
        while(i < n){
            if(nums[i] > 0){
              ans[posIndex] = nums[i];
              posIndex+=2;
            } else {
              ans[negIndex] = nums[i];
              negIndex+=2;
            }
            i++;
        }
        return ans;

    }
}